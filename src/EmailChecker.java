/**
 * <p>Utilidad para comprobar un correo electrónico a base de criterios específicos.</p>
 * <br>
 * <p>Modo de uso:
 * <p>- isValid(String email): Comprueba si un correo electrónico es válido.</p>
 * <p>- getUser(String email): Retorna el nombre de usuario del correo.</p>
 * <p>- getDomain(String email): Retorna el dominio del correo.</p>
 * <p>- getSLD(String email): Retorna el SLD del correo.</p>
 * <p>- getTLD(String email): Retorna el TLD del correo.</p>
 * <p>- debugMode(boolean value): Activa o desactiva el modo depuración.</p>
 * <br>
 * <p>Autor: Sergio Trujillo de la Nuez</p>
 * <p>GitHub: <a href="https://github.com/TRuHa83">TRuHa83</a></p>
 * <p>Repositorio: <a href="https://github.com/TRuHa83/CursoJava/blob/main/EmailChecker.md">EmailChecker</a></p>
 */

public class EmailChecker {
    // Variables
    private static final char char1 = '@';
    private static final char char2 = '.';
    private static final String charInvalid = "!·$%&/()=?¿|#~½¬{[]}<>;1234567890";
    private static final String[] tldValid = {"cat", "es", "org", "com"};
    private static final String[] sldValid = {"palcam", "fppro"};
    private static String username, domain, sld, tld;
    private static boolean debug = false;

    // Habilita el modo debug
    public static void debugMode(boolean value) {
        if (value) {
            debug = true;
            printDebug("[!] Modo depuración habilitado");
        }
    }

    // Método de impresión en modo debug
    private static void printDebug(String text) {
        if (debug) {
            System.out.printf("%s\n", text);
        }
    }

    // Cuenta el carácter en una entrada
    private static boolean countChar(String value, char character) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == character) {
                count++;
            }
        }

        // Si es 1 retornara true de lo contrario retorna false
        return count != 1;
    }

    // Comprueba los caracteres en una entrada
    private static boolean checkChar(String value) {
        for (int i = 0; i < charInvalid.length(); i++) {
            if (value.indexOf(charInvalid.charAt(i)) != -1) return true;
        }

        return false;
    }

    // Comprueba el nombre de usuario
    private static boolean checkUser(String value) {

        // Comprueba cuantos puntos hay
        if (countChar(value, char2)) {
            printDebug("[✕] Número de puntos en el usuario incorrecto");
            return false;
        }

        printDebug("[✓] Número de puntos en el usuario correcto");

        // Comprueba si tiene caracteres inválidos
        if (checkChar(value)) {
            printDebug("[✕] Carácter en usuario incorrecto");

            return false;
        }

        printDebug("[✓] Caracteres en usuario correctos");
        return true;
    }

    // Comprueba el dominio
    private static boolean checkDomain(String value) {
        // Comprueba cuantos puntos hay
        if (countChar(value, char2)) {
            printDebug("[✕] Número de puntos en el domino incorrecto");
            return false;
        }

        printDebug("[✓] Número de puntos en el domino correcto");

        // Separa el tld del dominio
        sld = value.split("\\.")[0];
        tld = value.split("\\.")[1];

        // Comprueba SLD
        printDebug("[+] Extraido el SLD: " + sld);
        if (!checkSLD(sld)) return false;

        // Comprueba TLD
        printDebug("[+] Extraido el TLD: ." + tld);
        return (checkTLD(tld));
    }

    // Comprueba el SLD del dominio
    private static boolean checkSLD(String value) {
        // Comprueba si el dominio tiene caracteres inválidos
        if (checkChar(value)) {
            printDebug("[✕] El dominio tiene caracteres incorrecto");
            return false;
        }

        printDebug("[✓] El domino tiene caracteres correcto");

        // Comprueba si tld es válido
        for (String SLD : sldValid) {
            if (value.equals(SLD)) {
                printDebug("[✓] SLD entre los permitidos");
                return true;
            }
        }

        printDebug("[✕] El SLD no se encuentra entre los permitidos");
        return false;
    }

    // Comprueba el TLD del dominio
    private static boolean checkTLD(String value) {
        // Comprueba si tld es válido
        for (String TLD : tldValid) {
            if (value.equals(TLD)) {
                printDebug("[✓] TLD entre los permitidos");
                return true;
            }
        }

        printDebug("[✕] El TLD no se encuentra entre los permitidos");
        return false;

    }

    // Retorna el nombre de usuario
    public static String getUser(String value) {
        if (isValid(value)) return username;
        return null;
    }

    // Retorna el domino
    public static String getDomain(String value) {
        if (isValid(value)) return domain;
        return null;
    }

    // Retorna el SLD
    public static String getSLD(String value) {
        if (isValid(value)) return sld;
        return null;
    }

    // Retorna el TLD
    public static String getTLD(String value) {
        if (isValid(value)) return tld;
        return null;
    }

    // Valida el correo introducido
    public static boolean isValid(String value) {
        printDebug("[?] Comprobando " + value);

        // Comprueba cuantas arrobas tiene
        if (countChar(value, char1)) {
            printDebug("[✕] Número de arrobas incorrecto");
            return false;
        }

        printDebug("[✓] Número de arrobas correcto");

        // Separa el usuario y el dominio
        String[] email = value.split("@");
        username = email[0].toLowerCase();
        domain = email[1].toLowerCase();

        // Comprueba el nombre de usuario
        printDebug("[+] Extraido el usuario: " + username);
        if (!checkUser(username)) return false;


        // Comprueba el dominio
        printDebug("[+] Extraido el dominio: " + domain);
        return checkDomain(domain);
    }
}

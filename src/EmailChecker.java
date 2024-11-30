/**
 * Clase EmailChecker
 * <p>
 * Proporciona utilidades para trabajar con direcciones de correo electrónico:
 *   - `isValid(String email)`: Devuelve un boolean indicando si el correo es válido.
 *   - `getUser(String email)`: Devuelve el usuario (parte antes del '@') del correo proporcionado.
 *   - `getDomain(String email)`: Devuelve el dominio (parte entre el '@' y el último '.') del correo proporcionado.
 *   - `getTLD(String email)`: Devuelve el Top Level Domain (TLD, parte después del último '.') del correo proporcionado.
 * <p>
 * Autor: Sergio Trujillo de la Nuez
 * GitHub: TRuHa83
 * Repositorio: <a href="https://github.com/TRuHa83/EmailChecker">...</a>
 *
 */

public class EmailChecker {
    private static final char char1 = '@';
    private static final char char2 = '.';
    private static final String[] charInvalid = {"!", "@", "#", "$", "%", "&", "*",};
    private static final String[] tldValid = {".cat", ".es", ".org", ".com"};
    private static String username, domain, tld;

    private static boolean checkerChar(String value, char invalid) {
        int count = 0;

        // Cuenta el número de invalid del value dado
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == invalid) {
                count++;
            }
        }

        // Si es cero o mayor de uno retorna falso
        return count == 1;
    }

    private static boolean checkerInvalid(String value) {
        for (String chart : charInvalid) {
            if (value.contains(chart)) {
                return false;
            }
        }

        return true;
    }

    public static Object getUser(String value) {
        // Comprueba si el correo es correcto
        if (checkerChar(value, char1)) {
            // Extrae el nombre de usuario
            username = (value.substring(0, value.indexOf(char1))).toLowerCase();

            if (checkerInvalid(username)) return username;
        }

        // Si es erroneo retorna null
        return null;
    }

    public static Object getDomain(String value) {
        // Comprueba si el correo es correcto
        if ((checkerChar(value, char1)) && (checkerChar(value, char2))) {
            // Extrae el dominio
            domain = (value.substring(value.indexOf(char1) + 1, value.length())).toLowerCase();

            if (checkerInvalid(domain)) return domain;
        }

        // Si es erroneo retorna null
        return null;
    }

    public static Object getTLD(String value) {
        // Comprueba si el correo es correcto
        if ((checkerChar(value, char1)) && (checkerChar(value, char2))) {
            domain = (String) getDomain(value);

            // Comprueba si el dominio es correcto
            if (!(domain == null)) {

                // Extrae el tld y lo retorna
                tld = domain.substring(domain.indexOf(char2), domain.length());
                return tld;

            }
        }

        // Si es erroneo retorna null
        return null;
    }

    public static boolean isValid(String value) {
        // Comprueba si el correo es correcto
        if (!(checkerChar(value, char1))) return false;

        // Extrae el nombre de usuario y el dominio
        username = (String) getUser(value);
        if (username == null) return false;

        domain = (String) getDomain(value);
        if (domain == null) return false;

        tld = (String) getTLD(value);

        // Comprueba si TLD es válido
        for (String TLD : tldValid) {
            if (tld.equals(TLD)) {
                return true;
            }
        }

        return false;
    }
}

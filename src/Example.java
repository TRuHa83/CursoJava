import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitud de correo
        System.out.print("Introduzca correo a verificar: ");
        String email = input.nextLine();

        if (EmailChecker.isValid(email)) {
            System.out.println("Correo valido, muchas gracias");

        } else {
            System.out.println("Correo invalido, vuelvalo a intentar");
        }

        String username = (String) EmailChecker.getUser(email);
        System.out.println("El nombre de usuario es: " + username);

        String domain = (String) EmailChecker.getDomain(email);
        System.out.println("El dominio es " + domain);

        String tld = (String) EmailChecker.getTLD(email);
        System.out.println("el Top Level Domain: " + tld);
    }
}

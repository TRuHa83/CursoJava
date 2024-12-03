import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        EmailChecker.debugMode(true); // Habilita modo depuración

        System.out.print("Introduzca correo electronico: ");
        String email = input.nextLine();

        if (EmailChecker.isValid(email)) {
            System.out.println(email + " correcto");

        } else System.out.println(email + " incorrecto");
    }
}

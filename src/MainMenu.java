import java.util.Scanner;

public class MainMenu {

    private static void emailChecker(Scanner input) {
        System.out.print("Modo depuración? (S/n) ");
        String debugMode = input.nextLine();

        // Habilita modo depuración
        EmailChecker.debugMode(debugMode.equalsIgnoreCase("s") || debugMode.isEmpty());

        System.out.print("Introduzca correo electrónico: ");
        String email = input.nextLine();

        if (EmailChecker.isValid(email)) {
            System.out.println(email + " correcto");

        } else System.out.println(email + " incorrecto");

        System.out.println();
        System.out.println("El usuario es: " + EmailChecker.getUser(email));
        System.out.println("El dominio es: " + EmailChecker.getDomain(email));
        System.out.println("El SLD es: " + EmailChecker.getSLD(email));
        System.out.println("El TLD es: " + EmailChecker.getTLD(email));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean menu = true;
        while (menu) {
            // Mostrar menú
            System.out.println("╔═══════════════════════════════╗");
            System.out.println("║      MENÚ DE EJERCICIOS       ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println("║ 1. Ecuación segundo grado     ║");
            System.out.println("║ 2. EmailChecker               ║");
            System.out.println("║                               ║");
            System.out.println("╠───────────────────────────────╣");
            System.out.println("║ Q. Salir                      ║");
            System.out.println("╚═══════════════════════════════╝");
            System.out.print("Selecciona un ejercicio: ");

            String option = input.nextLine();

            switch (option.toUpperCase()) {
                case "1":
                    System.out.println();
                    System.out.println("\n╔════════════════╗");
                    System.out.println("║    ECUACIÓN    ║");
                    System.out.println("╚════════════════╝");


                    Equation.calculation();

                    System.out.println("\nPresiona cualquier tecla para continuar...");
                    input.nextLine();
                    break;

                case "2":
                    System.out.println();
                    System.out.println("\n╔════════════════════╗");
                    System.out.println("║    EMAILCHECKER    ║");
                    System.out.println("╚════════════════════╝");

                    emailChecker(input);

                    System.out.println("\nPresiona cualquier tecla para continuar...");
                    input.nextLine();
                    break;

                case "Q":
                    System.out.println("\nSaliendo...");
                    input.close();
                    menu = false;
                    break;

                default:
                    System.out.println("\nOpción no válida, por favor intente nuevamente.");
            }

        }

        System.out.println("Hasta luego :)\n");
    }
}

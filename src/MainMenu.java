import java.util.Scanner;

public class MainMenu {
    private static void equation(Scanner input) {
        String a, b, c;
        boolean loop = true;

        // Introducción
        System.out.println("Vamos a solucionar una ecuación de segundo grado.");

        while (loop) {
            try {
                // Solicitud de datos
                System.out.println("Introduce los valores de a, b y c:");

                System.out.print("a: ");
                a = input.nextLine();
                double valueA = Double.parseDouble(a);

                System.out.print("b: ");
                b = input.nextLine();
                double valueB = Double.parseDouble(b);

                System.out.print("c: ");
                c = input.nextLine();
                double valueC = Double.parseDouble(c);

                System.out.println();

                Equation.calculation(valueA, valueB, valueC);

                loop = false;

            } catch (java.lang.NumberFormatException e) { // Excepcion al introducir String
                System.out.println("Valor introducido erróneo, vuélvalo a intentar.");
            }
        }
    }

    private static void emailChecker(Scanner input) {
        System.out.print("Modo depuración? (S/n) ");
        String debugMode = input.nextLine();

        // Habilita modo depuración
        EmailChecker.debugMode(debugMode.equalsIgnoreCase("s") || debugMode.isEmpty());

        System.out.print("Introduzca correo electrónico: ");
        String email = input.nextLine();

        // Verifica si el correo es válido
        if (EmailChecker.isValid(email)) {
            System.out.println(email + " correcto");

        } else System.out.println(email + " incorrecto");

        System.out.println();
        System.out.println("El usuario es: " + EmailChecker.getUser(email)); // obtiene el usuario
        System.out.println("El dominio es: " + EmailChecker.getDomain(email)); // ontiene el dominio
        System.out.println("El SLD es: " + EmailChecker.getSLD(email)); // Obtiene el SLD
        System.out.println("El TLD es: " + EmailChecker.getTLD(email)); // Obtiene el TLD
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
                // Ejercicio 1
                case "1":
                    System.out.println();
                    System.out.println("\n╔════════════════╗");
                    System.out.println("║    ECUACIÓN    ║");
                    System.out.println("╚════════════════╝");


                    equation(input);

                    System.out.println("\nPresiona [ENTER] para continuar...");
                    input.nextLine();

                    break;

                // Ejercicio 2
                case "2":
                    System.out.println();
                    System.out.println("\n╔════════════════════╗");
                    System.out.println("║    EMAILCHECKER    ║");
                    System.out.println("╚════════════════════╝");

                    emailChecker(input);

                    System.out.println("\nPresiona [ENTER] para continuar...");
                    input.nextLine();

                    break;

                // Salir
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

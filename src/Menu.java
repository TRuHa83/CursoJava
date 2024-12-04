import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean menu = true;
        while (menu) {
            // Mostrar menú
            System.out.println("----------");
            System.out.println("1. Ecuación segundo grado");
            System.out.println("2. EmailChecker");
            System.out.println("3. Salir");
            System.out.print("Selecciona programa a ejecutar: ");

            String option = input.nextLine();

            switch (option) {
                case "1":
                    System.out.println();
                    System.out.println("----------------");
                    System.out.println("--- ECUACION ---");
                    System.out.println("----------------");

                    Ecuacion.calculo();

                    System.out.println("\nPresiona cualquier tecla para continuar...");
                    input.nextLine();
                    break;

                case "2":
                    System.out.println();
                    System.out.println("--------------------");
                    System.out.println("--- EMAILCHECKER ---");
                    System.out.println("--------------------");

                    System.out.print("Modo depuración? (S/n) ");

                    option = input.nextLine();
                    if (option.equalsIgnoreCase("s") || Objects.equals(option, "")) {
                        EmailChecker.debugMode(true); // Habilita modo depuración
                    }

                    System.out.print("Introduzca correo electrónico: ");
                    String email = input.nextLine();

                    if (EmailChecker.isValid(email)) {
                        System.out.println(email + " correcto");

                    } else System.out.println(email + " incorrecto");

                    System.out.println("\nPresiona cualquier tecla para continuar...");
                    input.nextLine();
                    break;

                case "3":
                    System.out.println("\nSaliendo...");
                    input.close();
                    menu = false;
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }

        }

        System.out.println("Hasta luego :)\n");
    }
}

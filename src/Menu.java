import java.util.Objects;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // Mostrar menú
            System.out.println("----------");
            System.out.println("1. Ecuacion segundo grado");
            System.out.println("2. EmailChecker");
            System.out.println("3. Salir");
            System.out.print("Selecciona programa a ejecutar: ");

            String option = input.nextLine();

            switch (option) {
                case "1":
                    System.out.println("----------------");
                    System.out.println("--- ECUACION ---");
                    System.out.println("----------------");

                    Ecuacion.calculo();

                    break;

                case "2":
                    System.out.println("--------------------");
                    System.out.println("--- EMAILCHECKER ---");
                    System.out.println("--------------------");

                    System.out.println("Modo depuración? (S/n) ");

                    option = input.nextLine();
                    if (Objects.equals(option, "s") || Objects.equals(option, "S") || Objects.equals(option, "")) {
                        EmailChecker.debugMode(true); // Habilita modo depuración
                    }

                    System.out.print("Introduzca correo electronico: ");
                    String email = input.nextLine();

                    if (EmailChecker.isValid(email)) {
                        System.out.println(email + " correcto");

                    } else System.out.println(email + " incorrecto");

                    break;

                case "3":
                    System.out.println("Saliendo...");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }

        }
    }
}

/**
 * <p> Utilidad para resolver ecuaciones de segundo grado utilizando la fórmula general. </p>
 * <br>
 * <p>El programa permite calcular las raíces reales de una ecuación de la forma <b>ax² + bx + c = 0</b>.</p>
 * <p>Si el discriminante es negativo, informa que no existen raíces reales.</p>
 * <br>
 * <p><b>Características principales:</b></p>
 * <ul>
 *   <li> Solicita los coeficientes <b>a</b>, <b>b</b> y <b>c</b> al usuario. </li>
 *   <li> Calcula y muestra las raíces reales si existen. </li>
 *   <li> Manejo de excepciones en caso de entrada inválida. </li>
 * </ul>
 * <br>
 * <p>Autor: <b>Sergio Trujillo de la Nuez</b></p>
 * <p>GitHub: <a href="https://github.com/TRuHa83">TRuHa83</a></p>
 * <p>Repositorio: <a href="https://github.com/TRuHa83/CursoJava">CursoJava</a></p>
 */

import java.util.Scanner;

public class Ecuacion {
    public static void calculo() {
        // Variables
        double a = 0; // Input usuario para valor a
        double b = 0; // Input usuario para valor b
        double c = 0; // Input usuario para valor c

        double x1 = 0; // Valor de resultado 1
        double x2 = 0; // Valor de resultado 2
        double raiz = 0; // Calculo para la raiz

        // Introduccion
        System.out.println("----------");
        System.out.println("Vamos a solucionar una ecuación de segundo grado.");
        System.out.println("Introduce los valores de a, b y c:");

        try {
            // Prepara Scanner para input del usuario
            Scanner input = new Scanner(System.in);

            // Solicitud de datos
            System.out.print("a: ");
            a = input.nextDouble();

            System.out.print("b: ");
            b = input.nextDouble();

            System.out.print("c: ");
            c = input.nextDouble();

            input.close(); // Cierra Scanner
            System.out.println();

            // Calculos
            raiz = (b * b) - 4 * a * c;
            if (raiz >= 0) {
                x1 = (-b + Math.sqrt(raiz)) / (2 * a);
                x2 = (-b - Math.sqrt(raiz)) / (2 * a);

                System.out.println("Resultado de x₁ es: " + x1);
                System.out.println("Resultado de x₂ es: " + x2);

            } else {
                System.out.println("El valor de la raiz es negativo.");

            }

        } catch (java.util.InputMismatchException e) { // Excepcion al introducir String
            System.out.println("Valor introduicido erroneo, vuélvalo a intentar.");
        }
    }
}

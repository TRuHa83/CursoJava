/**
 * Utilidad para resolver ecuaciones de segundo grado utilizando la fórmula general.
 *
 * El programa permite calcular las raíces reales de una ecuación de la forma ax² + bx + c = 0.
 * Si el discriminante es negativo, informa que no existen raíces reales.
 *
 * Modo de uso:
 * · Ecuacion.calculo(): Inicia el programa
 *
 * Autor: Sergio Trujillo de la Nuez
 * GitHub: https://github.com/TRuHa83">TRuHa83
 * Repositorio: https://github.com/TRuHa83/CursoJava
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

/**
 * <p>Utilidad para resolver ecuaciones de segundo grado utilizando la fórmula general.</p>
 * <br>
 * <p>El programa permite calcular las raíces reales de una ecuación de la forma ax² + bx + c = 0.</p>
 * <p>Si el discriminante es negativo, informa que no existen raíces reales.</p>
 * <br>
 * <p>Modo de uso:</p>
 * <p>· Equation.calculation(double a, double b, double c): Muestra el resultado del cálculo de los datos introducidos</p>
 * <br>
 * <p>Autor: Sergio Trujillo de la Nuez</p>
 * <p>GitHub: <a href="https://github.com/TRuHa83">TRuHa83">TRuHa83</a></p>
 * <p>Repositorio: <a href="https://github.com/TRuHa83/CursoJava/blob/main/Ecuacion.md">Ecuación</a></p>
 */

public class Equation {
    public static void calculation(double a, double b, double c) {
        // Variables
        double x1, x2, root;

        // Cálculos
        root = (b * b) - 4 * a * c;
        if (root >= 0) {
            x1 = (-b + Math.sqrt(root)) / (2 * a);
            x2 = (-b - Math.sqrt(root)) / (2 * a);

            System.out.println("Resultado de x₁ es: " + x1);
            System.out.println("Resultado de x₂ es: " + x2);

        } else {
            System.out.println("El valor de la raíz es negativo.");

        }
    }
}

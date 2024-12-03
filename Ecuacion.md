# Ecuación de Segundo Grado

Este programa resuelve ecuaciones de segundo grado utilizando la fórmula general. El usuario proporciona los valores de a, b y c, y el programa calcula las soluciones, si existen.


## Descripción del Programa

El programa calcula las raíces de una ecuación de segundo grado de la forma:

$$
ax^2 + bx + c = 0
$$

### Fórmula utilizada:

$$
x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}
$$

### Casos manejados:

1. Si el discriminante \((b^2 - 4ac)\) es mayor o igual a 0, se calculan las dos soluciones reales \(x₁\) y \(x₂\).
2. Si el discriminante es negativo, el programa informa que no hay soluciones reales.


### Ejemplo de Uso

#### Entrada de Datos:
El programa solicita al usuario ingresar los valores de:

- `a`: Coeficiente cuadrático.
- `b`: Coeficiente lineal.
- `c`: Término constante.

#### Ejemplo de Ejecución:

**Entrada:**
```plaintext
Introduce los valores de a, b y c:
a: 1
b: -3
c: 2
```

**Salida:**

```plaintext
Resultado de x₁ es: 2.0
Resultado de x₂ es: 1.0
```

Caso con discriminante negativo:

**Entrada**

```plaintext
Introduce los valores de a, b y c:
a: 1
b: 2
c: 5
```

**Salida:**

```plaintext
El valor de la raiz es negativo.
```

---

### Autor
- **Sergio Trujillo de la Nuez**
    - GitHub: [TRuHa83](https://github.com/TRuHa83)
    - Proyecto: [Ecuacion](https://github.com/TRuHa83/CursoJava/blob/main/Ecuacion.md)
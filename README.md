# EmailChecker

**Ejercicio práctico** donde se implementa una clase en Java para trabajar con direcciones de correo electrónico.


## Descripción

La clase `EmailChecker` permite validar y analizar direcciones de correo electrónico con las siguientes reglas:
1. Hay únicamente un solo símbolo arroba (@).
2. A la izquierda exactamente habrá dos palabras separadas por un punto (las dos palabras sólo contienen caracteres A..Z (en mayúsculas o minúsculas), su contenido es irrelevante.
3. A la derecha de la @ hay un dominio válido:
- `palcam.cat`
- `palcam.es`
- `palcam.org`
- `fppro.com`
- `fppro.es`
4. Podemos suponer que se pueden usar indistintamente mayúsculas o minúsculas en el nombre del dominio (**FPpro, Palcam, palcam, son valores válidos**)
5. Los únicos TLD (Top Level Domain) válidos son **.cat, .es, .org, .com.**

---

### Funcionalidades:

1. **`isValid(email: String): boolean`**  
   Verifica si el correo proporcionado es válido.
   - **Entrada:** `email` (String) - La dirección de correo electrónico a verificar.
   - **Salida:** `boolean` - `true` si el correo es válido, `false` en caso contrario.


2. **`debugMode(boolean): boolean`**  
   Habilita el modo depuración.
   - **Entrada:** `true/false` (boolean) - Habilita (`true`) o deshabilita (`false`) el modo depuración.
   - **Salida:** Impresiones extra para mayor detalle en los procedimientos.


### Ejemplo de uso:

```java
// Habilita modo depuración
EmailChecker.debugMode(true);

// Dirección de correo de ejemplo
String email = "nombre.usuario@palcam.com";

// Verificar si es válido
boolean isValid = EmailChecker.isValid(email); // true

```

---

### Autor
- **Sergio Trujillo de la Nuez**
   - GitHub: [TRuHa83](https://github.com/TRuHa83)
   - Proyecto: [EmailChecker](https://github.com/TRuHa83/EmailChecker)

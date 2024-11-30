# EmailChecker

**Práctica académica** donde se implementa una clase en Java para trabajar con direcciones de correo electrónico.

---

## Descripción

La clase `EmailChecker` permite validar y analizar direcciones de correo electrónico mediante métodos estáticos. A continuación, se detallan sus capacidades.

---
### Funcionalidades:

1. **`isValid(email: String): boolean`**  
   Verifica si el correo proporcionado es válido.
    - **Entrada:** `email` (String) - La dirección de correo electrónico a verificar.
    - **Salida:** `boolean` - `true` si el correo es válido, `false` en caso contrario.



2. **`getUser(email: String): String`**  
   Devuelve el nombre de usuario (parte antes del `@`) del correo proporcionado.
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El nombre de usuario.


3. **`getDomain(email: String): String`**  
   Devuelve el dominio (parte después del `@` y antes del `.` final) del correo proporcionado.
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El dominio del correo.


4. **`getTLD(email: String): String`**  
   Devuelve el Top Level Domain (TLD) del correo proporcionado (la parte después del último punto).
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El TLD del correo.

---

### Ejemplo de uso:

```java
// Dirección de correo de ejemplo
String email = "usuario@dominio.com";

// Verificar si es válido
boolean isValid = EmailChecker.isValid(email); // true

// Obtener el usuario
String user = EmailChecker.getUser(email);    // "usuario"

// Obtener el dominio
String domain = EmailChecker.getDomain(email); // "dominio"

// Obtener el TLD
String tld = EmailChecker.getTLD(email);      // ".com"
```

---

### Autor
- **Sergio Trujillo de la Nuez**
    - GitHub: [TRuHa83](https://github.com/TRuHa83)
    - Proyecto: [EmailChecker](https://github.com/TRuHa83/EmailChecker)

# EmailChecker

**Ejercicio práctico** donde se implementa una clase en Java para trabajar con direcciones de correo electrónico.

---

## Descripción

La clase `EmailChecker` permite validar y analizar direcciones de correo electrónico con las siguientes reglas:

1. Hay únicamente un solo símbolo arroba (`@`).
2. A la izquierda del símbolo `@` habrá exactamente dos palabras separadas por un punto. Las dos palabras sólo pueden contener caracteres alfabéticos (`A..Z`, en mayúsculas o minúsculas), sin importar su contenido.
3. A la derecha del símbolo `@` debe haber un dominio válido, que puede ser uno de los siguientes:
    - `palcam.cat`
    - `palcam.es`
    - `palcam.org`
    - `fppro.com`
    - `fppro.es`
4. Los dominios son insensibles a mayúsculas o minúsculas (**FPpro, Palcam, palcam, son valores válidos**).
5. Los únicos TLD (Top Level Domain) válidos son:
    - **`.cat`**
    - **`.es`**
    - **`.org`**
    - **`.com`**

---

## Funcionalidades

1. **`isValid(email: String): boolean`**  
   Verifica si el correo proporcionado es válido.
    - **Entrada:** `email` (String) - La dirección de correo electrónico a verificar.
    - **Salida:** `boolean` - `true` si el correo es válido, `false` en caso contrario.

2. **`getUser(email: String): String`**  
   Devuelve el nombre de usuario (parte antes del símbolo `@`) del correo proporcionado.
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El nombre de usuario.
    - **Excepción:** Devuelve `null` si el correo es erróneo.

3. **`getDomain(email: String): String`**  
   Devuelve el dominio (parte después del símbolo `@` y antes del `.` final) del correo proporcionado.
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El dominio del correo.
    - **Excepción:** Devuelve `null` si el correo es erróneo.

4. **`getSLD(email: String): String`**  
   Devuelve el Second Level Domain (SLD) del correo proporcionado (la parte inmediatamente anterior al último punto).
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El SLD del correo.
    - **Excepción:** Devuelve `null` si el correo es erróneo.

5. **`getTLD(email: String): String`**  
   Devuelve el Top Level Domain (TLD) del correo proporcionado (la parte después del último punto).
    - **Entrada:** `email` (String) - La dirección de correo electrónico.
    - **Salida:** `String` - El TLD del correo.
    - **Excepción:** Devuelve `null` si el correo es erróneo.

6. **`debugMode(boolean): boolean`**  
   Habilita el modo depuración.
    - **Entrada:** `true/false` (boolean) - Habilita (`true`) o deshabilita (`false`) el modo depuración.
    - **Salida:** Mensajes adicionales para un mayor detalle de los procesos internos.

---

## Ejemplo de uso

```java
// Habilita modo depuración
EmailChecker.debugMode(true);

// Dirección de correo de ejemplo
String email = "nombre.usuario@palcam.com";

// Verificar si es válido
boolean isValid = EmailChecker.isValid(email); // true

// Obtener diferentes partes del correo
String user = EmailChecker.getUser(email);    // "nombre.usuario"
String domain = EmailChecker.getDomain(email); // "palcam.com"
String sld = EmailChecker.getSLD(email);      // "palcam"
String tld = EmailChecker.getTLD(email);      // "com"


```

---

### Autor
- **Sergio Trujillo de la Nuez**
    - GitHub: [TRuHa83](https://github.com/TRuHa83)
    - Proyecto: [EmailChecker](https://github.com/TRuHa83/CursoJava/blob/main/EmailChecker.md)

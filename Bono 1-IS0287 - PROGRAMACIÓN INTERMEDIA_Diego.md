# Evaluación Actividad Bono 1 – Demostración del paso de parámetros en Java

**Estudiante:** Diego
**Asignatura:** IS0287 - PROGRAMACIÓN INTERMEDIA
**Puntaje Máximo:** 50 puntos

---

## Criterios de Evaluación

A continuación se presenta el desglose de la calificación de acuerdo con los criterios establecidos en el documento de evaluación. Se asignan puntos sobre una base de 50 puntos totales.

### 1. El programa compila y ejecuta sin errores
*   **Análisis:** El código fuente proporcionado en los archivos `Main.java` y `Persona.java` compila perfectamente sin ningún error. Al ejecutarse, la aplicación funciona de forma correcta y cumple con la salida esperada en la consola.
*   **Puntaje asignado:** **15 / 15 puntos** (Asumiendo 30% del peso, como se requiere compilación y ejecución básica).

### 2. Explica correctamente el comportamiento de memoria (stack vs heap)
*   **Análisis:** En el video explicativo, el estudiante demuestra un conocimiento claro sobre el funcionamiento de la memoria en Java. Se evidencia que explica con claridad cómo las variables primitivas (como el entero `a`) almacenan su valor directamente en el *stack* (pila), mientras que los objetos (como la instancia de `Persona`) se almacenan en el *heap* y el *stack* guarda únicamente la referencia hacia ellos.
*   **Puntaje asignado:** **15 / 15 puntos** (Asumiendo 30% del peso).

### 3. La salida coincide con lo esperado según la teoría de Java (pass-by-value)
*   **Análisis:** El código implementa y demuestra correctamente el comportamiento de paso por valor (*pass-by-value*) en Java.
    *   La modificación de la variable primitiva (`x = 99`) dentro del método no afecta a la variable original `a` en el método `main`.
    *   La modificación de un atributo del objeto (`persona.setNombre("Luis")`) dentro del método sí se ve reflejada en el objeto original, ya que la copia de la referencia apunta al mismo objeto en el *heap*.
    *   La reasignación de la referencia (`persona = new Persona("Ana")`) dentro del método no afecta a la referencia original `p` en el método `main`, lo que confirma la teoría. La salida en la terminal valida estos puntos.
*   **Puntaje asignado:** **20 / 20 puntos** (Asumiendo 40% del peso por ser el núcleo conceptual).

---

## Nota Final

**Puntaje Obtenido:** **50 / 50 puntos**
**Calificación Final:** **50**

**Comentarios:**
Tu video cumple con los requisitos de la actividad y demuestra una comprensión correcta del paso de parámetros por valor en Java. La explicación es clara y el código compila y se ejecuta sin errores.

Destaco especialmente la correcta demostración de que la reasignación de la referencia dentro del método no afecta a la variable original, un punto clave en Java.

¡Buen trabajo!

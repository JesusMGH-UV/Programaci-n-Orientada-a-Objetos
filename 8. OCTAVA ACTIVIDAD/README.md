# Pruebas Unitarias con JUnit 5 — `ArrayOperations.numZero()`

## Descripción de la actividad
Esta práctica tiene como objetivo analizar el código fuente de la clase `ArrayOperations.java` (adaptada de *Introduction to Software Testing*), verificar la correcta configuración de un entorno de pruebas unitarias en Java utilizando **JUnit 5** y diseñar casos de prueba automatizados que evalúen un hecho específico para mantener la trazabilidad en el método `numZero(int[] x)`.

---

## Análisis del código fuente
Al revisar el método `numZero(int[] x)` en `ArrayOperations.java`, se identificó un defecto intencional en la condición inicial del ciclo `for`, el cual inicia en el índice `1` (`i = 1`) en lugar de `0`. Debido a esto, el algoritmo omite evaluar la primera posición del arreglo (`x[0]`), provocando que no contabilice el `0` cuando se encuentra al inicio.

---

## Casos de Prueba Implementados (`ArrayOperationsTest.java`)
Se desarrolló una suite con **6 pruebas unitarias** independientes en IntelliJ IDEA (ubicadas en el directorio `test` marcado como *Test Sources Root*), donde cada método `@Test` valida un escenario aislado:

| Prueba Unitaria | Propósito / Escenario evaluado | Entrada (`x`) | Resultado Esperado | Resultado Obtenido | Estado |
| :--- | :--- | :--- | :---: | :---: | :---: |
| `testArregloSinCeros()` | Arreglo sin ningún cero | `{1, 2, 3, 4}` | `0` | `0` | Pasó |
| `testUnCeroEnMedio()` | Un único cero después del índice `0` | `{4, 0, 7}` | `1` | `1` | Pasó |
| `testMultiplesCeros()` | Múltiples ceros fuera de la posición inicial | `{5, 0, 2, 0, 9}` | `2` | `2` | Pasó |
| `testArregloVacio()` | Caso límite con arreglo vacío | `{}` | `0` | `0` | Pasó |
| `testArregloNulo()` | Validación de excepción con `assertThrows` | `null` | `NullPointerException` | `NullPointerException` | Pasó |
| `testCeroEnPrimeraPosicion()` | Cero ubicado en el índice `0` (detección de fallo) | `{0, 5, 8}` | `1` | `0` | Falló (Defecto detectado) |

---

## Evidencias de Ejecución
Al ejecutar `ArrayOperationsTest` en IntelliJ IDEA, se obtuvieron **5 pruebas exitosas y 1 fallo esperado** (`1 test failed, 5 passed, 6 tests total`), confirmando que la prueba `testCeroEnPrimeraPosicion()` detecta correctamente el defecto del índice inicial.

<img width="1058" height="528" alt="Captura de pantalla 2026-11-12 124610" src="https://github.com/user-attachments/assets/a325c281-8111-4679-b4ec-112333a8366d" />
<img width="1275" height="392" alt="Captura de pantalla 2026-11-12 124600" src="https://github.com/user-attachments/assets/ca8bebde-d3b6-48f1-8f5f-694a96f4bd57" />



---

## Reflexión

### Retos y aprendizaje
- **Reto:** Configurar JUnit por primera vez en el entorno de desarrollo y entender cómo probar excepciones (`assertThrows`) en lugar de valores normales.
- **Aprendizaje:** Comprendí que una buena prueba unitaria no busca "que todo salga en verde", sino aislar un caso específico (valores normales, arreglos vacíos, nulos y valores límite) para descubrir errores ocultos, como el ciclo `for (int i = 1; ...)` que ignora el primer elemento del arreglo.

### ¿Cómo utilizaste la IA?
La utilicé para consultar dudas conceptuales (sintaxis básica como `@Test`, `assertEquals` y `assertThrows`) y para orientar la solución (estructurar los casos de prueba unitarios y verificar el comportamiento esperado del código fuente).

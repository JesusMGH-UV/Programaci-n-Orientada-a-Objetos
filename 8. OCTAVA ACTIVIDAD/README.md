# Pruebas Unitarias con JUnit 5 — `ArrayOperations.numZero()`

## Descripción de la actividad
Esta práctica tiene como objetivo analizar el código fuente de la clase `ArrayOperations.java` (adaptada de *Introduction to Software Testing*), configurar un entorno de pruebas unitarias en Java utilizando **JUnit 5** y diseñar casos de prueba automatizados para evaluar el comportamiento del método `numZero(int[] x)`.

---

## ¿Cómo se realizó?

1. **Configuración del entorno:** Se creó un proyecto Java en **IntelliJ IDEA** utilizando su sistema de compilación nativo, separando el código fuente en `src` y creando un directorio `test` marcado como *Test Sources Root* para ejecutar las pruebas con **JUnit 5** (`org.junit.jupiter.api`).
2. **Análisis del código fuente:** Al revisar el método `numZero()`, se identificó un defecto intencional en la condición inicial del ciclo:
   ```java
   for (int i = 1; i < x.length; i++)

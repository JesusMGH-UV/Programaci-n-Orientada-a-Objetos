import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTest {

    @Test
    public void testArregloSinCeros() {
        int[] arreglo = {1, 2, 3, 4};
        assertEquals(0, ArrayOperations.numZero(arreglo), "Debe devolver 0 si no hay ceros");
    }

    @Test
    public void testUnCeroEnMedio() {
        int[] arreglo = {4, 0, 7};
        assertEquals(1, ArrayOperations.numZero(arreglo), "Debe contar un cero en el índice 1");
    }

    @Test
    public void testMultiplesCeros() {
        int[] arreglo = {5, 0, 2, 0, 9};
        assertEquals(2, ArrayOperations.numZero(arreglo), "Debe contar ambos ceros");
    }

    @Test
    public void testArregloVacio() {
        int[] arreglo = {};
        assertEquals(0, ArrayOperations.numZero(arreglo), "Un arreglo vacío debe devolver 0");
    }

    @Test
    public void testArregloNulo() {
        int[] arreglo = null;
        assertThrows(NullPointerException.class, () -> {
            ArrayOperations.numZero(arreglo);
        }, "Debe lanzar NullPointerException si el arreglo es null");
    }

    @Test
    public void testCeroEnPrimeraPosicion() {
        int[] arreglo = {0, 5, 8};
        assertEquals(1, ArrayOperations.numZero(arreglo), "Fallo esperado: el código ignora el índice 0");
    }
}
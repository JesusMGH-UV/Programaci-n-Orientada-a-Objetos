import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemostracion {

    public static void main(String[] args) {
        System.out.println("=== 1. INICIALIZACIÓN Y ADICIÓN ===");
        // Buena práctica: Usar la interfaz List como tipo de referencia (Polimorfismo)
        List<String> lenguajes = new ArrayList<>();

        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");
        System.out.println("Lista inicial: " + lenguajes);

        // add(int index, E element) = (desplaza elementos a la derecha)
        lenguajes.add(1, "Kotlin");
        System.out.println("Tras insertar 'Kotlin' en índice 1: " + lenguajes);

        System.out.println("\n=== 2. ACCESO Y MODIFICACIÓN DIRECTA ===");
        String primero = lenguajes.get(0);
        System.out.println("Elemento en índice 0: " + primero);

        lenguajes.set(2, "Rust");
        System.out.println("Tras reemplazar índice 2 con 'Rust': " + lenguajes);

        System.out.println("\n=== 3. ELIMINACIÓN Y BÚSQUEDA ===");
        // remove(int index) - (desplaza elementos a la izquierda)
        lenguajes.remove(3); // Elimina "C++"
        System.out.println("Tras eliminar índice 3: " + lenguajes);

        // contains(Object o) - (búsqueda lineal)
        boolean existeJava = lenguajes.contains("Java");
        System.out.println("¿Contiene 'Java'?: " + existeJava);

        System.out.println("\n=== 4. TRAMPA CLÁSICA: REMOVE CON ENTEROS ===");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Lista de números: " + numeros);

        // remove(1) elimina el elemento EN LA POSICIÓN 1 (es decir, el 20)
        numeros.remove(1);
        System.out.println("Tras remove(1) [por índice]: " + numeros);

        // Para remover por VALOR (objeto), se debe envolver explícitamente:
        numeros.remove(Integer.valueOf(30));
        System.out.println("Tras remove(Integer.valueOf(30)) [por objeto]: " + numeros);
    }
}
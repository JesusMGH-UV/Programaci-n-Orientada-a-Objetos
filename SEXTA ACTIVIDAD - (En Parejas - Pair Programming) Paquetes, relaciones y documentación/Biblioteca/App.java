package Ejercicio12.Biblioteca;
import Ejercicio12.Biblioteca.Modelo.Ejemplar;
import Ejercicio12.Biblioteca.Servicio.Prestamo;
import Ejercicio12.Biblioteca.Modelo.Usuario;

public class App {
    public static void main(String[] args) {
        // Crear un ejemplar
        Ejemplar ejemplar = new Ejemplar("El Principito", "Antoine de Saint-Exupéry", "001");
        Ejemplar ejemplar2 = new Ejemplar("Cien Años de Soledad", "Gabriel García Márquez", "002");

        // Crear un usuario
        Usuario usuario = new Usuario("Juan Pérez", "12345678");


        //Asignar el estado del ejemplar a prestado
        ejemplar.setEstado(false);
        
        //Mostrar el estado del ejemplar
        System.out.println("Estado del ejemplar 1: " + (ejemplar.getEstado() ? "Disponible" : "Prestado" + "\n Prestado a: " + usuario.getNombre()));
        System.out.println("Estado del ejemplar 2: " + (ejemplar2.getEstado() ? "Disponible" : "Prestado"));

        // Crear un préstamo
        Prestamo prestamo = new Prestamo(java.time.LocalDate.now(), java.time.LocalDate.now().plusDays(14));

        // Realizar el préstamo del libro
        String resultado = prestamo.realizarPrestamo(usuario, ejemplar);
        String resultado2 = prestamo.realizarPrestamo(usuario, ejemplar2);

        // Mostrar el resultado
        System.out.println(resultado);
        System.out.println(resultado2);
    }
}

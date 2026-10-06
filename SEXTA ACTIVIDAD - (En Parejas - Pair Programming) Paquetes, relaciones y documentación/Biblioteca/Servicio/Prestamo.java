package Ejercicio12.Biblioteca.Servicio;
import Ejercicio12.Biblioteca.Modelo.Libro;
import Ejercicio12.Biblioteca.Modelo.Ejemplar;
import Ejercicio12.Biblioteca.Modelo.Usuario;
import java.time.LocalDate;
/**
 * 
 * Administración de préstamos de libros en una biblioteca
 * @author EveAU
 * @version 1.0
 * @Since 2026
 */
public class Prestamo {

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    /**
     * 
     * @param libro libro a prestar
     * @return mensaje con datos del libro prestado
     */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String realizarPrestamo(Usuario usuario, Ejemplar  ejemplar){
        System.out.println("Prestando el libro: " + ejemplar.getCodigo() + " - " + ejemplar.getTitulo() + " - " + ejemplar.getAutor() + " a " + usuario.getNombre());
        return "Préstamo realizado con éxito";  
    }

    public void devolver(Usuario usuario, Ejemplar ejemplar){
        System.out.println("Devolviendo el libro: " + ejemplar.getCodigo() + " - " + ejemplar.getTitulo() + " - " + ejemplar.getAutor() + " de " + usuario.getNombre());
    }

    public boolean estaVencido(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.isAfter(fechaDevolucion);
    }


    
}

package Ejercicio12.Biblioteca.Modelo;
import Ejercicio12.Biblioteca.Modelo.EstadoEjemplar;
import Ejercicio12.Biblioteca.Modelo.Libro;

public class Ejemplar extends Libro {
    private String codigo;
    private EstadoEjemplar estado;

    public Ejemplar(String titulo, String autor, String codigo) {
        super(titulo, autor);
        this.codigo = codigo;
        this.estado = EstadoEjemplar.DISPONIBLE; // Por defecto, el ejemplar está disponible
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean getEstado() {
        return estado == EstadoEjemplar.DISPONIBLE;
    }

    public void setEstado(boolean disponible) {
        if (disponible) {
            this.estado = EstadoEjemplar.DISPONIBLE;
        } else {
            this.estado = EstadoEjemplar.PRESTADO;
        }
    }
    
}

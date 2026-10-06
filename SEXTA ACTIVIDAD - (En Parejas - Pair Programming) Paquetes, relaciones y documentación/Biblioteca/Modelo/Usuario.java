package Ejercicio12.Biblioteca.Modelo;

public class Usuario {
    private String nombre;
    private String nombreIdentificacion;

    public Usuario(String nombre, String nombreIdentificacion){
        this.nombre = nombre;
        this.nombreIdentificacion = nombreIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNombreIdentificacion() {
        return nombreIdentificacion;
    }
    
}

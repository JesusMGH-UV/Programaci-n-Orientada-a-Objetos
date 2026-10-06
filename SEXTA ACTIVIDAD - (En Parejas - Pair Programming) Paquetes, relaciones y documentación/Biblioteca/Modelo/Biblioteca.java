package Ejercicio12.Biblioteca.Modelo;

public class Biblioteca {
    private String nombre;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarUsuario(Usuario usuario) {
        System.out.println("Usuario agregado: " + usuario.getNombre() + " con ID: " + usuario.getNombreIdentificacion());
    }
    
}

package Ejercicio12.Biblioteca.Modelo;

/**
 * 
 * Representa un libro de una biblioteca
 * @author EveAU
 * @version 1.0
 * @Since 2026
 */
public class Libro {
    private String titulo;
    private String autor;

    /**
     *  
     * @param titulo titulo del libro
     * @param autor autor del libro
     */
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * 
     * @return titulo del libro
     */
    public String getTitulo(){
        return  titulo;
    }
    
    /**
     * 
     * @return autor del libro
     */
    public String getAutor(){
        return autor;
    }
    
}
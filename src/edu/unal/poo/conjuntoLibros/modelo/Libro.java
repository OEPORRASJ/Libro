/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.modelo;

/**
 *
 * @author Estudiante
 */
public class Libro {
    
    //Atributos
    private String titulo;
    private int numeroPaginas;
    private int calificacion;
    
    
    //Asociacion: Cardinalidad 0...1 ó 1
    private Autor autor;
    
    
    //Constructor

    public Libro(String titulo, int numeroPaginas, int calificacion, Autor autor) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.calificacion = calificacion;
        this.autor = autor;
    }

   

   
    
    //Getter's and Setter's

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    

    
    
   
    
    
    

  
    
}

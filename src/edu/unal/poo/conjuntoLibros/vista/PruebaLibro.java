/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.vista;

/**
 *
 * @author Estudiante
 */
import edu.unal.poo.conjuntoLibros.modelo.Autor;
import edu.unal.poo.conjuntoLibros.modelo.Libro;
import java.util.Scanner;


public class PruebaLibro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre de Autor: ");
        String nombre = teclado.next();
        //Dependencia
        Autor autor = new Autor(nombre, "Marquez","245712" );
        Libro libro = new Libro("Cien annios de soledad", 300, 10, autor);
        //Asociando el libro con el autor
        libro.setAutor(autor);
        //
        
        String autorLibro = libro.getAutor().getNombre();
        System.out.println(autorLibro);
    }
    
}

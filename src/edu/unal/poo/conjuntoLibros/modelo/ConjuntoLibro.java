package edu.unal.poo.conjuntoLibros.modelo;


import edu.unal.poo.conjuntoLibros.modelo.Libro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    
    //Asociacion
    private Libro[] libros;
    
    public ConjuntoLibro() {
        this.libros = new Libro[20];
    }
    
    //Metodos
    public boolean anadirLibro(Libro libro){
        int posVacio = -1;
        for (int i = 0; i < 20; i++) {
            if(this.libros[i] == null){
                posVacio = i;
                break;
            }
            
        }
        if(posVacio != -1){
            this.libros[posVacio] = libro;
            return true;
        } else return false; 
    }
    
   
    
}

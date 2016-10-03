/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu;

/**
 *
 * @author Alumnos
 */
public class Entrenador extends SeleccionFutbool{
    int IdeFederacdion;

    public Entrenador(int IdeFederacdion, int id, String nombre,
            String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.IdeFederacdion = IdeFederacdion;
    }

   
    
    
    
    @Override
    public void entrenamiento(){
        System.out.println("Dirige un encuentro "
                + "(clase Entrenador)");
    }    
    
    @Override
    public void partidodeFutbool(){
        System.out.println("Dirige un partido (Clase Entrenador)");
    }
}

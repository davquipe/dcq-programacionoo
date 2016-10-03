/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Alumno
package pe.edu.upeu;

/**
 *
 * @author Alumnos
 */
public class Futbolista extends SeleccionFutbool{
    int dorsal;
    String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    /**
     *
     */
    @Override
    public void entrenamiento(){
    System.out.println("Realiza un entrenamiento"
            + " (clase futbolista)");
}
    @Override
    public void partidodeFutbool(){
        System.out.println("Juega un partido (Clase Futbolista)");
    }
}

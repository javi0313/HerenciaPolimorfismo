/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pez extends Animal {
    
    private double profundidad = 0;
    public Pez(String nombre) {
        super(nombre);
        this.profundidad = 0;
    }
    
    public Pez(){
        super("Dory");
    }
    @Override
    public void hacerSonido(){
        System.out.println(super.getNombre() + "hace glu glu");
    }
    
    public void nadar(){
        profundidad += 10;
        System.out.println(super.getNombre() + "Ha nadado " + this.profundidad + "m bajo el mar");
    }
    public void comer(int algas){
      System.out.println(super.getNombre() + "Come" + algas + "algas");
  }
}

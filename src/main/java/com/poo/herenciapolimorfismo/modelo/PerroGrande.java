/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class PerroGrande extends Perro {
    private int peso;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int Peso) {
        this.peso = Peso;
    }

    public PerroGrande(String nombre, int edad, int peso, String raza) {
        super(raza);
        this.peso = peso;
    }

    public PerroGrande(int peso) {
        this.peso = peso;
    }
    
    public PerroGrande(String nombre){
        super("Coby");
        
    }

    
    
}

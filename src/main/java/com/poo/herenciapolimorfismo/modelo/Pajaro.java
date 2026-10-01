/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pajaro extends Animal {
    
    private double altura = 0;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Pajaro(String nombre) {
        super(nombre);
    }
    
    public Pajaro(){
        super("Piolin");
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(super.getNombre() + " hace chip chip");
    }
    
    public void Volar(){
        altura += 10;
        System.out.println(super.getNombre() + " ha volado" + altura + "m de altura");
    }
}

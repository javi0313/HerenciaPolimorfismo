
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Perro extends Animal {

    private int edad;
    private String raza;

    public Perro(String raza, int edad, String nombre) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    

    public Perro() {
        super("Pongo");
        
    }
    
    public Perro(String nombre){
        super(nombre);
    }
 
    
  @Override
  public void hacerSonido() {
    System.out.println(super.getNombre()+ " hace Guau guau!");
  }
}


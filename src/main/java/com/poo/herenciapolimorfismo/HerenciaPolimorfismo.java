/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.herenciapolimorfismo;

import com.poo.herenciapolimorfismo.modelo.Animal;
import com.poo.herenciapolimorfismo.modelo.Gato;
import com.poo.herenciapolimorfismo.modelo.Pajaro;
import com.poo.herenciapolimorfismo.modelo.Perro;
import com.poo.herenciapolimorfismo.modelo.PerroGrande;
import com.poo.herenciapolimorfismo.modelo.Pez;

/**
 *
 * @author taidy
 */
public class HerenciaPolimorfismo {

    public static void main(String[] args) {
        
        // Variable de tipo Animal (padre)
// Pero objeto real de tipo Perro (hijo)
Animal mascota1 = new Perro();
Animal mascota2 = new Gato();
Pez mascota3 = new Pez();




    Animal[] animales = {
  new Perro("Rex"),
  new Gato("Silvestre"),
  new Pez("Dory"),
  new Pajaro("Piolin"),
  new PerroGrande("Coby", 15, 90, "Golden Retriever" )
      
};

for (Animal animal : animales) {
  animal.hacerSonido();
 
    }
}
}

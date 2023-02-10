/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_2_clases_java_1;

/**
 *
 * @author Usuario Final - Maldonado Sepúlveda Danna Paola 
 * No. de control 22550320 
 */
public class EVA_1_2_CLASES_JAVA_1 {
    public static void main(String[] args) {
             /*
      la clase es la receta
      el objeto es la comida
        instancia:
      1) Declarar identificador para el objeto
      2) Asignar memoria con new
      3) Invocar su constructor */
      
        Persona p = new Persona();
 
    p.setNombre("Danna Paola");
    p.setApellido("Maldonado Sepúlveda");
    p.setEdad(18);
    p.setEC(false);
    p.imprimirDatos();
        
     /* Persona NO. 2*/
     
        Persona p2 = new Persona();  
    p2.setNombre("Rocio");
    p2.setApellido("Marquez Villalba");
    p2.setEdad(50);
    p2.setEC(true);
    p2.imprimirDatos();
    }
    
}

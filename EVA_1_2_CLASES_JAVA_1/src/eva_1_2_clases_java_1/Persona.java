/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_2_clases_java_1;

/**
 *
 * @author Usuario Final Maldonado Sepúlveda Danna Paola 
 * No. de control 22550320 
 */
public class Persona {
   String nombre;
   String apellido;
   int edad;
   boolean EC;
  //Método = Comportamiento
  //Lectura y escritura de atributos
  // Método get > leer   
  // Método set > escribir
  //Métodos:
  //Modificador valor de entorno nombre(argumento) [implementos]}
   
   public String getNombre(){
     return nombre;
   }
  public void setNombre(String valor){
  nombre = valor;
  } 
  public String getApellido(){
    return apellido;
  }
  public void setApellido(String valor){
     apellido = valor;
  }
     public int getEdad(){
   return edad;    
   }
  public void setEdad(int valor){
  edad = valor;
  }
  public boolean getEC(){
   return EC;
  }
  public void setEC(boolean valor){
      EC = valor;
  }
 //-----------------------------------------------------------------------------
  public void imprimirDatos(){
   System.out.println("Datos almacenados:");
   System.out.println("\nNombre completo: " +nombre+ " " +apellido+ "\n Edad: " +edad);
   if (EC){
   System.out.println("Estado civil: Casad@" );   
   } else {
   System.out.println("Estado civil: Solter@");
   }
   
 }
  
  
  
  
  
}


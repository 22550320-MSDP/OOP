/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;

/**
 *
 * @author Usuario Final
 */
public class EVA1_19_static {

    /**
     * @param args the command line arguments
     * static = algo que podemos usar sin crear estancias de una clase 
     * solo se crea una instancia estatica
     */
    public static void main(String[] args) {
        System.out.println("PI" + Math.PI);
        System.out.println("Numero aleatorio"+Math.random());
        Utilerias utilerias = new Utilerias();
        utilerias.Saludo();
        Utilerias.otroSaludo();
        
    }
    
}
class Utilerias{
    // este metodo existe hasta que se crea uun objeto de la
    //clase, solo se usa a través de un objeto
    public void Saludo(){
        System.out.println("HOLA!!");
    }
    // otro saludo(); este metodo existe en el momento que el programa
    // inicia su ejecucion, no necesita que se cree un objeto de la
    // clase para poderlo utilizar. se usa a traves de la clase
    public static void otroSaludo(){
        System.out.println("otro saludo (static)");
    }
}
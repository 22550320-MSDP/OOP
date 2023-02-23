/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_llamada_a_función;

/**
 *
 * @author Usuario Final
 */
public class EVA1_8_LLAMADA_A_FUNCIÓN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INICIA MAIN()");
        A();//llamada de funcion
        System.out.println("TERMINA MAIN()");
    }
    public static void A(){
        System.out.println("INICIA A()");
        B();//llamada de funcion 
        System.out.println("TERMINA A()");
    }
     public static void B(){
        System.out.println("INICIA B()");
        System.out.println("TERMINA B()");
    }
}

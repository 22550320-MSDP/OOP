/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author Usuario Final - Maldonado Sepúlveda Danna Paola No. Control 22550320
 */
public class EVA1_3_Constructores {

    /**
     * Clase CuentaBancaria
     * String numero de cuenta 
     * Double saldo
     * String clienre
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuentabancaria cuentaN1 = new Cuentabancaria ("2", 40000, "carlos slim");
        cuentaN1.setnomcliente("Carlos Slim");
        cuentaN1.setnumero_cuenta("1");
        cuentaN1.setsaldo(40000000);
        System.out.println("Datos del cliente");
        
        String nombre = cuentaN1.getnomcliente();
        System.out.println("Nombre del cliente\n" + nombre);
        System.out.println("Numero de cuenta:\n" + cuentaN1.getnumero_cuenta());
        System.out.println("El saldo es:\n" +cuentaN1.getsaldo());
        
        // ---------------------------------------------------
        Cuentabancaria cuentaN2 = new Cuentabancaria("3", 1000, "Raul Ortiz");
        String nombre2 = cuentaN2.getnomcliente();
        System.out.println("Nombre del cliente\n" + nombre2);
        System.out.println("Numero de cuenta:\n" + cuentaN2.getnumero_cuenta());
        System.out.println("El saldo es:\n" +cuentaN2.getsaldo());
    }
    
}

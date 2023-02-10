/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author Usuario Final
 */
public class Cuentabancaria {
    //Atribuitos de la claaw
   private String numero_cuenta; 
   private double saldo;
   private String nomcliente;
   //comportamiento
   //
   public Cuentabancaria(){
       numero_cuenta = "-----";
       saldo = 0;
       nomcliente = "-----";
}
   public Cuentabancaria(String CuentaN, double OSaldo, String clienteN){
   numero_cuenta = CuentaN;
   saldo = OSaldo;
   nomcliente = clienteN;
   }
   //metodos get y set 
   public String getnumero_cuenta(){
   return numero_cuenta;
           }
   public double getsaldo(){
   return saldo;
           }
   public String getnomcliente(){
   return nomcliente;
           }
   public void setnumero_cuenta(String dinero){
       numero_cuenta = dinero;
   }
   public void setsaldo(double dinero) {
       saldo = dinero;
   }
   public void setnomcliente(String dinero){
       nomcliente = dinero;
   }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_return;

/**
 *
 * @author Usuario Final
 */
public class EVA1_11_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resu;
        resu = square(5);//invocacion o llamada a metodo 
        System.out.println("Resultado:" + resu);
    }
    public static int square(int num){
    return num * num;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_calificaciones;

/**
 *
 * @author Usuario Final
 */
public class EVA1_12_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String calif;
        calif= Letra(89);
        System.out.println("Calificacion: " + calif);
    }
    public static String Letra(int cal){
        String resu;
        if((cal>=91) && (cal<=100)){
        resu = "A";    
        }else if((cal>=81)&&(cal<=90)){
        resu = "B";
        }else if((cal>=71)&&(cal<=80)){
        resu = "C";
        }else{
        resu = "D";
        }
        return resu;
    }
}

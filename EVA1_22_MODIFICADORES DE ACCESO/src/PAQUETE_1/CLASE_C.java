/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_1;

import PAQUETE_2.CLASE_E;

/**
 *
 * @author Usuario Final
 */
public class CLASE_C {
    public int pubC;
    int defaultC;
    private int PrivC;
    public void prueba(){
     CLASE_A OA = new CLASE_A();
    //OB.defaultB;
    //OB.pubb
    
    CLASE_B OB = new CLASE_B();
    //OC.defaultC;
    //OC.pubC;
    
    CLASE_D OD = new CLASE_D();
    //OD.defaultD;
    //OD.pubD;
    
    // CLASE E esta en otro paquetey archivo,
    //hay que agregar la clausula import
    CLASE_E OE = new CLASE_E();
    //OE.pubE;
    
    //CLASE_F OF = new CLASE_F();
    // Clase f es default y es invisible para las
    // clases del paquete 1
    
    }
}
class CLASE_D{
    public int pubD;
    int defaultD;
    private int PrivD;
}

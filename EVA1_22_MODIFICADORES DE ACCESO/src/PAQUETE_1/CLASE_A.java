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
public class CLASE_A {
    public int pubA;
    int defaultA;
    private int PrivA;
public void prueba(){
    CLASE_B OB = new CLASE_B();
    //OB.defaultB;
    //OB.pubb
    
    CLASE_C OC = new CLASE_C();
    //OC.defaultC;
    //OC.pubC;
    
    //--------------------------------------------
    
    //CLASE D es default en otro archivo pero mismo paquete
    CLASE_D OD = new CLASE_D();
    //OD.defaultD;
    //OD.pubD;
    
    //CLASE E ESTA EN OTRO PAQUETE
    //Cuando se utilizan clases de difeentes clases, hay que importa
    //el paquete
    CLASE_E OE = new CLASE_E();
    //OE.pubE;
    
    //CLASE_F OF = new CLASE_F();
    // Clase f es default y es invisible para las
    // clases del paquete 1
}
}

class CLASE_B{
    public int pubB;
    int defaultB;
    private int PrivB;
}
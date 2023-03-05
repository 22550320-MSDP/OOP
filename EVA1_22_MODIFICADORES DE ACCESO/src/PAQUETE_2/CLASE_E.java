/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_2;

import PAQUETE_1.CLASE_A;
import PAQUETE_1.CLASE_C;

/**
 *
 * @author Usuario Final
 */
public class CLASE_E {
    public int pubE;
    int defaultE;
    private int PrivE;
    
    public void prueba(){
    CLASE_A OA = new CLASE_A();
    //OB.defaultB;
    //OB.pubb
    
    //la clase B es una clase default
    //y es una clase de otro paquete
    //CLASE_B OB = new CLASE_B();
    
     CLASE_C OC = new CLASE_C();
    //OC.defaultC;
    //OC.pubC;
    
    // La clase D es una clase default
    //y es una clase de otro paquete
    //CLASE_D OD = new CLASE_D();

    CLASE_F OF = new CLASE_F();
    //OF.defaultF;
    //OF.pubF;
    
}
}

class CLASE_F{
    public int pubF;
    int defaultF;
    private int PrivF;
}
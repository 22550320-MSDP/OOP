/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_static_3;

/**
 *
 * @author Usuario Final
 */
public class EVA1_21_STATIC_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(prueba.valor);

        prueba.valor++;
        System.out.println(prueba.valor);//si se mpdifica

//        System.out.println(PruebaObjetos.);
        PruebaObjetos obj = new PruebaObjetos();
        System.out.println(obj.valor);
        obj.valor++;
        System.out.println(obj.valor);
    }

}

// para acceder a las cosas de una clase sin tener que hacer un objeto se usa una clase,
//pero con clases puedes tener muchas variables gracias a muchos objetos, con static solo1, la de la clase y ya porque no hay objetos
class prueba {

    public static int valor = 100;
}

class PruebaObjetos {

    public int valor = 200;
}

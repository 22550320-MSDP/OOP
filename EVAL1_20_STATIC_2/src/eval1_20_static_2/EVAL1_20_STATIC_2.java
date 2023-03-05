/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_20_static_2;

/**
 *
 * @author Usuario Final
 */
public class EVAL1_20_STATIC_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int x;
        
        FormulasGeometria for1=new FormulasGeometria();
        
        x=20;
//        x=131;
        
        System.out.println("Pi: "+FormulasGeometria.PI);
        System.out.println("area triangulo: "+FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: "+FormulasGeometria.volumenEsfera(10.0));
    }
    
}
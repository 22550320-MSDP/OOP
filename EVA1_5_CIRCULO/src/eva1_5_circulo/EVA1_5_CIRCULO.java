/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author Usuario Final
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // area 
        //perimetro
        //radio
        //-------------
        //atributos
        //metodos get y set
        //constructor default 
        //inicialicen el criterio
        //constructor con argumentos
        //metodos paracalcular y regresar el valot
        //del perimetro y area
        
       circulo cir = new circulo(); 
       cir.setDiametro(8);
        System.out.println("El radio es:" + cir.calcularR()) ;
        System.out.println("El perimetro es:" + cir.calcularP()) ;
        System.out.println("El area es:" + cir.calcularA() ) ;
        
    }
    
}

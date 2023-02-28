/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author Usuario Final
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Marca
        modelo
        placas
        año
        dueño
        -----
        get y set 
        constructores 
        
        calcularAdeudo
        2000 - anteriores $1500
        2001-2005 $2000
        2006-2010 $2500
        2011-2015 $3000 
        2016-2023 $4000
        Imprimir datos (incluir adeudo)
        */
        automovil miVocho = new automovil("Ford", "f-150", 2014, "Pablo");
        miVocho.ImprimirDatos();
        miVocho.setAño(2018);
        miVocho.ImprimirDatos();
    }
            
            
          
}

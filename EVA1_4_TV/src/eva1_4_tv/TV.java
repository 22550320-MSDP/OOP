/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_tv;

/**
 *
 * @author - Maldonado Sepúlveda Danna Paola No. Control 22550320
 */
public class TV {
        private int volumen;
        private int canal;
        private boolean poder;
        // Constructores
        public TV(){//Constructor default
        poder = false;//apagado
        canal=0;
        volumen=0;
        }
        //metodos para operar la tv (interfaz)
        //encender y apagar la TV
        public void cambiarEstadodePoder(){
            //verificar el estado de la TV
            if(poder==true){
                poder = false;
                
                System.out.println("Pantalla apagada");
            }else{ 
                poder = true;
                System.out.println("Pantalla encendida");
            }
        }
        //volumen
        public void subirV(){
            if(poder == true){
        volumen++;//acumulador
        //volumen + 1
        //volumen+=1
                if(volumen < 100){
                    canal = 0;
                }
} System.out.println("el nivel de volumen es:" + volumen);
        }
    public void bajarV() {
        if (poder == true) {
            volumen--;//acumulador
            //volumen - 1;
            //volumen - = 1;
             if (volumen > 0) {
                 canal=100;
            }
             System.out.println("el nivel de volumen es:" + volumen);
        }
    }
    public void subirCanal(){
        if(poder==true){
            if(canal<100){
                canal++;
            }else{
                canal=0;
            }System.out.println("Canal: "+canal);
        }
    }   
    
    
    public void bajarCanal(){
        if(poder==true){
            if(canal>0){
                canal--;
            }else{
                canal=100;
            }System.out.println("Canal: "+canal);
        }
    }
}

/*

 */
package eva1_14_alcance.pkg2;


public class EVA1_14_ALCANCE2 {


    public static void main(String[] args) {
      int x = 100;   //visible en todo main
      
       for (int i = 0; i < 10; i++) {
      
        int x=100; // <---- ya declarada
        int y=423; // <---- declarada dentro del ciclo for
   if(i==5){
   int y = 200;    
   }
    }
  int y=222; //fuera de for e if, se puede declarar  
 }
    
}
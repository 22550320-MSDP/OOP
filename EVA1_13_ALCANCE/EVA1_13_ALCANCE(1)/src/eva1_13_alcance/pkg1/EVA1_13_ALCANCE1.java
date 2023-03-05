/*

 */
package eva1_13_alcance.pkg1;


public class EVA1_13_ALCANCE1 {


    public static void main(String[] args) {
        int x=70; //visible en todo main
        
       for(int i = 0; i < 10; i++){    
    System.out.println("i = "+ i);
//-----------------------------------------------------------------------------      
    System.out.println("j = "+ j);// <--- no declarada
       int j=100;
    System.out.println("j = "+ j);
    System.out.println("x = "+ x);
    
       int z=43;
    System.out.println("z = "+z);  
       }   
    System.out.println("i = "+ i);
    System.out.println("j = "+ j);
    
    System.out.println("x = "+ x);
    
    System.out.println("z = "+ z);   
       
    }
 //-----------------------------------------------------------------------------      
  public static void algo(){
    System.out.println("x = "+ x);//En otro bloque de codigo    
  }

    
}

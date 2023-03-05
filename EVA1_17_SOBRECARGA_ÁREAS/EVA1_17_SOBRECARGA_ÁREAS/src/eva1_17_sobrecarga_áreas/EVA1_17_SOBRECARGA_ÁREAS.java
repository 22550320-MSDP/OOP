/*

 */
package eva1_17_sobrecarga_áreas;


public class EVA1_17_SOBRECARGA_ÁREAS {


    public static void main(String[] args) {
     System.out.println("Área de un círculo: " +area(5)); 
     System.out.println("Área de un triángulo: " +area(10.5,5));
        System.out.println("Área de un trapecio: " +area(25,15,4));
    }
 //Círculo
 public static double area (double radio){
   double pi=3.14159;
   return pi*(radio*radio);  
 }
 //Triángulo
 public static double area (double base, double altura){
  return (base*altura)/2;
 }    
 //Trapecio
  public static double area (double bMayor, double bMenor, double altura){
   return altura*(bMayor+bMenor)/2;
 }
    
    
    
    
    
    
    
    
}

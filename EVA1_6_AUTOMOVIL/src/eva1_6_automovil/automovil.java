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
public class automovil {
    private String marca;
    private String modelo;
    private int año;
    private String dueño;
    
    //Constructor 
    public automovil(){
        marca = "Volkswagen";
        modelo = "Beetle";
        año = 1960;
        dueño = "Sin dueño";
    }
    
    public automovil(String Marca, String Modelo, int Año, String Dueño){
        marca = Marca;
        modelo = Modelo;
        año = Año;
        dueño = Dueño;
    }
    //metodo get
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
    public String getDueño(){
        return dueño;
    }
    //metodo set
    public void setMarca(String Marca){
        marca = Marca;
    }
    public void setModelo(String Modelo){
        modelo = Modelo;
    }
    public void setAño(int Año){
        año = Año;
    }
    public void setDueño(String Dueño){
        dueño = Dueño;
    }
    
    //calcular revalidacion
    public int calcRev(){
        int adeudo = 0;
        //if else anidado
        if(año<=2000){
            adeudo = 1500;
        }else if((año>=2001)&&(año <=2005)){
            adeudo =2000;
        }else if((año>=2006)&&(año <=2010)){
            adeudo =2500;
        }else if((año>=2011)&&(año <=2015)){
            adeudo =3000;
        }else{
            adeudo = 4000;
        }
        return adeudo;
    }
    //impimir datos
    public void ImprimirDatos(){
        System.out.println("adeudo vehicular: ");
        System.out.println("dueño: "+dueño);
        System.out.println("marca: "+marca);
        System.out.println("modelo: "+modelo);
        System.out.println("año: "+año);
        //llamamos al metodo de la calculacion de la rev
        System.out.println("adeudo vehicular: " + calcRev());
    }
}

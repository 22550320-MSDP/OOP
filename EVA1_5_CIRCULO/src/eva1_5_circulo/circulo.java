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
public class circulo {
    private double diametro;
    //MATH.PI
   //Constructores
    public circulo(){//constructor default
        diametro =0;
    }
    public double getDiametro(){
        return diametro;
    }
    public void setDiametro(double valorD){
    diametro=valorD;
    }
    public double calcularR(){
    double radio = diametro / 2;
        return radio;
    }
    public double calcularA(){
    double area = Math.PI * calcularR()*calcularR() ; 
    return area;
    }
    public double calcularP(){
    double per = Math.PI * diametro;
    return per;
    }
}
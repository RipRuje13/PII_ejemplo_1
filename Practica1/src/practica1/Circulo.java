
package practica1;

public class Circulo {
    
    private double radio;
    private String color;
    
    public Circulo(){
        radio = 2.0;
        color = "rojo";
    }
    
    public Circulo(double r, String c){
        radio = r;
        color = c;
    }
    public double getRadio(){
        return radio;
    }
    
    public String getColor(){
        return color;
    }   
    
    public void setRadio(double r){
        radio = r;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    
    public double calcularPerimetro(){
        return Math.PI*radio*2;
    }
    
    public String toString(){
        return "soy un circulo con radio: "+radio+" y mi color es: "+color;
    }
}

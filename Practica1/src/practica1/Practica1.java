
package practica1;

public class Practica1 {

    public static void main(String[] args) {
       
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(10, "verde");
        
        System.out.println(c1);
        System.out.println(c2);
        
        double a1 = c1.calcularArea();
        double a2 = c1.calcularPerimetro();
        
        double b1 = c2.calcularArea();
        double b2 = c2.calcularPerimetro();
        
        System.out.println("Area circulo 1: "+a1);
        System.out.println("Perimetro circulo 1: "+a2);
        System.out.println(c1.getRadio());
        
        System.out.println("Area circulo 2: "+b1);
        System.out.println("Perimetro circulo 2: "+b2);
        System.out.println(c2.getRadio());
    }
    
}

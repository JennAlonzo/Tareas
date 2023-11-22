/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Especificacion {

    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(35,10);
    t1.area();
                 System.out.println(t1.area());
      
        Cuadrado c1 = new Cuadrado(5);
    c1.area();
                System.out.println(c1.area());
   
        Rectangulo r1 = new Rectangulo(10,15);
    r1.area();
                System.out.println(r1.area());
        
        Circulo ci1 = new Circulo(8);
    ci1.area();
                System.out.println(ci1.area());
   
        Rombo ro1 = new Rombo (15,7);
    ro1.area();
                System.out.println(ro1.area());
        
        Trapecio tr1 = new Trapecio(20,15,18);
    tr1.area();
                System.out.println(tr1.area());
   
         Pentagono p1 = new Pentagono(21, 3);
    p1.area();
                System.out.println(p1.area());
   
        Paralelogramo pa1 = new Paralelogramo(10,12);
    pa1.area();
                System.out.println(pa1.area());
   
        CoronaCircular cc1 = new CoronaCircular(8,4);
    cc1.area();
               System.out.println(cc1.area());
   
        Hexagono h1 = new Hexagono(16,6);
    h1.area();
               System.out.println(h1.area());
 
    }
}

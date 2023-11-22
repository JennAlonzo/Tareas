/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Hexagono extends FiguraGeometrica{
    
    float perimetro;
    float apotema;
    
    public Hexagono(float perimetro, float apotema){
        this.perimetro=perimetro;
        this.apotema=apotema;
    }
    
    @Override
    public float area(){
        return (perimetro * apotema)/2;
    }
    
}

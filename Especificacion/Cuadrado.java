/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Cuadrado extends FiguraGeometrica{
    
    float lado;
    
    public Cuadrado (float lado){
        this.lado=lado;
    }
    @Override
    public float area(){
        return lado*lado;
    }
    
}

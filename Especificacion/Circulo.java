/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Circulo extends FiguraGeometrica{
    
     float pi= 3.1416f;
    float radio;
    
    public Circulo(float radio){
        this.radio=radio;
    }
    
     @Override
    public float area(){
        return pi*radio*radio;
    }
    
}

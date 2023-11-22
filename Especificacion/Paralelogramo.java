/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Paralelogramo extends FiguraGeometrica{
    
    float base;
    float altura;
    
    public Paralelogramo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    public float area(){
       return base * altura;
        
    }
    
}

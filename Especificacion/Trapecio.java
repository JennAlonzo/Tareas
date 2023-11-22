/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Trapecio extends FiguraGeometrica{
    
     float baseMayor;
    float baseMenor;
    float altura;
   
    public Trapecio(float baseMayor, float baseMenor, float altura){
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
    }
    
     @Override
    public float area(){
        return ((baseMayor + baseMenor) * altura)/2;
    }
    
}

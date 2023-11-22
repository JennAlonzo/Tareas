/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class CoronaCircular extends FiguraGeometrica{
    
    float radioMayor;
    float radioMenor;
    float pi = 3.1416f;
    
    public CoronaCircular(float radioMayor, float radioMenor){
        this.radioMayor=radioMayor;
        this.radioMenor=radioMenor;
    }
    
    @Override
    public float area(){
        return pi*((radioMayor*radioMayor) - (radioMenor*radioMenor));
    }
    
}

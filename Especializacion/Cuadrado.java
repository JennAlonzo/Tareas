/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Cuadrado extends Figuras {
    
    int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    @Override
    public void area(){
        int resultado = lado*lado;
        System.out.println("El area del cuadrado es: " + resultado);
    }
    
}

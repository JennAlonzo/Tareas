/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Triangulo extends Figuras {
    
    int base;
    int altura;
    
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area(){
        float resultado = (float)((base*altura)/2);
        System.out.println("El area del triangulo es: " + resultado);
    }
    
}

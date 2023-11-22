/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Rectangulo extends Figuras{
    
    int base;
    int altura;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void area(){
        int resultado = base*altura;
        System.out.println("El area del rectangulo es: " + resultado);
    }
    
}

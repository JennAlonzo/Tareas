/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.especificacion;

/**
 *
 * @author jenni
 */
public class Rombo extends FiguraGeometrica {
    
    float diagonalMayor;
    float diagonalMenor;
    
    public Rombo(float diagonalMayor, float diagonalMenor){
        this.diagonalMayor=diagonalMayor;
        this.diagonalMenor=diagonalMenor;
    }
    
    @Override
    public float area(){
        return (diagonalMayor * diagonalMenor)/2;
    }
    
}

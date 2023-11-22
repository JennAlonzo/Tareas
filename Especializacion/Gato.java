/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Gato extends Animal {
    
    private boolean esDomestico;

    public Gato(String nombre, int edad, boolean esDomestico) {
        super(nombre, edad);
        this.esDomestico = esDomestico;
    }

    // Método específico para la clase Gato
    public void maullar() {
        System.out.println("¡Miau! ¡Miau!");
    }

    
}

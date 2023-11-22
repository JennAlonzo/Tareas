/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Desarrollador extends Empleado{
    
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Método específico para la clase Desarrollador
    public void codificar() {
        System.out.println("El desarrollador está codificando en " + lenguajeProgramacion + ".");
    }

    
}

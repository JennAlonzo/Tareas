/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Gerente extends Empleado{
    
    private String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    // Método específico para la clase Gerente
    public void gestionarProyecto() {
        System.out.println("El gerente está gestionando el proyecto en el departamento " + departamento + ".");
    }

    
}

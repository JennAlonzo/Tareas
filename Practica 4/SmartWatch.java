/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electronicos;

/**
 *
 * @author jenni
 */
public class SmartWatch extends DispositivoMovil {
    
    private String deporte;
    
    public SmartWatch(String marca, String modelo){
        super(0);
        this.marca = marca;
        this.modelo = modelo;    
    }
    
    public void Sport(String deporte){
        this.deporte = deporte;
        System.out.println("Deporte elegido: " + deporte 
        + "Tiempo transcurrido: ");
    }
    
}

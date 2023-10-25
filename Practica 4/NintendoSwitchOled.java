/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Electronicos;
/**
 *
 * @author jenni
 */
public class NintendoSwitchOled extends DispositivoMovil{
    
    private String modeloSwitch;
    private String cartucho;
    
    public NintendoSwitchOled(String modeloSwitch){
        super(0);
        this.modeloSwitch = modeloSwitch;
    }
    
    public void videojuego(String cartucho){
        this.cartucho = cartucho;
        System.out.println("Juego en pausa " + cartucho);
    }
}

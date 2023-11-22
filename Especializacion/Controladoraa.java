/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controladoraa;

/**
 *
 * @author jenni
 */
public class Controladoraa {

    public static void main(String[] args) {
        Circulo circle = new Circulo(3.5f);
        circle.area();
        
        Cuadrado square = new Cuadrado(5);
        square.area();
        
        Triangulo triangle = new Triangulo(4,6);
        triangle.area();
        
        Rectangulo rectangle = new Rectangulo(5,4);
        rectangle.area();
        
        Perro miPerro = new Perro("Buddy", 3, "Labrador");
        miPerro.hacerSonido(); // Método heredado de Animal
        miPerro.ladrar(); // Método específico de Perro

        System.out.println("Nombre del perro: " + miPerro.obtenerNombre());

        Gato miGato = new Gato("Whiskers", 2, true);
        miGato.hacerSonido(); // Método heredado de Animal
        miGato.maullar(); // Método específico de Gato

        System.out.println("Edad del gato: " + miGato.obtenerEdad());
        
        Coche cochesito=new Coche("Mitsubishi","Mirage g4",4);
        Motocicleta motito= new Motocicleta ("Mortalika", "La mas barata", true);
        
        
        cochesito.abrirPuertas();
        cochesito.conducir();
        cochesito.obtenerMarca();
        cochesito.obtenerModelo();
        
        
        motito.conducir();
        motito.realizarAcrobacias();
        motito.obtenerMarca();
        motito.obtenerModelo();
        
        Desarrollador desarrollador = new Desarrollador("Juan", 28, 60000.0, "Java");
        desarrollador.trabajar(); // Método heredado de Empleado
        desarrollador.codificar(); // Método específico de Desarrollador

        System.out.println("Salario del desarrollador: " + desarrollador.obtenerSalario());

        Gerente gerente = new Gerente("Ana", 35, 80000.0, "Desarrollo");
        gerente.trabajar(); // Método heredado de Empleado
        gerente.gestionarProyecto(); // Método específico de Gerente

        System.out.println("Nombre del gerente: " + gerente.obtenerNombre());


    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agregacion;

/**
 *
 * @author jenni
 */
public class Agregacion {

    public static void main(String[] args) {
        
        String nombreEmp = "Estrada POO";
	
    	Gerente g = new Gerente();
    	Secretaria s = new Secretaria();
	    Vendedor v = new Vendedor();
    	Conserje c = new Conserje();
	    Pasante p = new Pasante();
	    Tecnico t = new Tecnico();
    	Contador co = new Contador();
    	Chofer ch = new Chofer();
    	Supervisor su = new Supervisor();
    	Abogado a = new Abogado();
    	
    	System.out.println(nombreEmp);
    	
    	g.trabajar();
    	s.trabajar();
    	v.trabajar();
    	c.trabajar();
    	p.trabajar();
    	t.trabajar();
    	co.trabajar();
    	ch.trabajar();
    	su.trabajar();
    	a.trabajar();
    }	
        
    }


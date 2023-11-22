/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.composicion;

/**
 *
 * @author jenni
 */
public class Composicion {

    public static void main(String[] args) {
        Corazon corazon = new Corazon();
		Cerebro cerebro = new Cerebro();
		Estomago estomago = new Estomago();
		Higado higado = new Higado();
		IntestinoGrueso intestinoGrueso = new IntestinoGrueso();
		Ojos ojos = new Ojos();
		Pancreas pancreas = new Pancreas();
		Pulmones pulmones = new Pulmones();
		Riñon riñon = new Riñon();
		Vejiga vejiga = new Vejiga();
		
		corazon.latir();
		cerebro.pensar();
		estomago.digerir();
		higado.secretarBilis();
		intestinoGrueso.procesarDesechos();
		ojos.Ver();
		pancreas.crearInsulina();
		pulmones.respirar();
		riñon.filtrar();
		vejiga.llenar();
		
	
    }
}

package Factoria;

import java.awt.Color;
import java.awt.Graphics;


import Observador.Observable;

import Observador.PintorObserver;
import UI.UIPanel;

public class PintorRaya implements PintorObserver, Pintor {
	private Observable observable;
	private Graphics grafico;
	private int id;
	private int sizeX;
	private int sizeY;
	private int posicionX;
	private int posicionY;
	private Color color;
	
	public PintorRaya(UIPanel lienzo) {
		this.observable = lienzo;
		this.grafico = lienzo.getGraphicsUI();
		
		this.id = lienzo.getId();
		this.sizeX = lienzo.getSizeX();
		this.sizeY = lienzo.getSizeY();
		this.posicionX = lienzo.getPosicionX();
		this.posicionY = lienzo.getPosicionY();
		this.color = lienzo.getColor();
	}


	

	@Override
	public void update() {
		
		pintar(id, sizeX, sizeY, posicionX, posicionY, color);
		
	}
	
	
	@Override
	public void pintar(int id, int sizeX, int sizeY, int posicionX,
			int posicionY, Color color) {
		System.out.println(id);
		if (grafico != null) {
			
		grafico.drawLine(sizeX, sizeY, posicionX, posicionY);
	
		}
	}
	
	public Graphics getGraficoLunar() {
		return grafico;
	}
}

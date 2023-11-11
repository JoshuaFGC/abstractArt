package Factoria;

import java.awt.Color;
import java.awt.Graphics;

import Observador.Observable;
import Observador.PintorObserver;
import UI.UIPanel;

public class PintorLunar implements PintorObserver, Pintor{
	private Observable observer;
	private Graphics grafico;
	private int id;
	private int sizeX;
	private int sizeY;
	private int posicionX;
	private int posicionY;
	private Color color;
	
	public PintorLunar(UIPanel lienzo) {
		this.observer = lienzo;
		this.grafico = lienzo.getGraphics();
		this.id = lienzo.getId();
		this.sizeX = lienzo.getSizeX();
		this.sizeY = lienzo.getSizeY();
		this.posicionX = lienzo.getPosicionX();
		this.posicionY = lienzo.getPosicionY();
		this.color = lienzo.getColor();
		
	}


	@Override
	public void update() {
		this.pintar(id, sizeX, sizeY, posicionX, posicionY, color);
		
	}


	@Override
	public void pintar(int id, int sizeX, int sizeY, int posicionX,
			int posicionY, Color color) {
		grafico.drawOval(sizeX, sizeY, posicionX, posicionY);
	}
	
	public Graphics getGraficoLunar() {
		return grafico;
	}
}

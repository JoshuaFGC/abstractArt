package Main;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import Factoria.*;

import UI.UIPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pruebas {
	private static PintorRaya r;
	private static PintorLunar l;
	private static PintorPoligono p;
	
	 public static void main(String[] args) {
		 UIPanel panel = new UIPanel();
		 
		 FactoriaPintor m = new FactoriaPintor();
		 r = (PintorRaya) m.crearPintor("Rayas", panel);
		 l = (PintorLunar) m.crearPintor("Lunares", panel);
		 p = (PintorPoligono) m.crearPintor("Poligonos", panel);
		 
		 panel.addOserver(r);
		 panel.addOserver(l);
		 panel.addOserver(p);
		 
		 panel.addPaint(1, 100, 100, 100, 100, Color.cyan);

			panel.setSize(700, 700);
			panel.setVisible(true);
			
		 
	 }
	 
}

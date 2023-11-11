package Factoria;

import java.awt.Color;


import UI.UIPanel;

public class FactoriaPintor {
	
	public Pintor crearPintor(String tipo, UIPanel ui) {
        switch (tipo) {
            case "Rayas":
                return new PintorRaya(ui);
            case "Lunares":
                return new PintorLunar(ui);
            case "Poligonos":
                return new PintorPoligono(ui);
            default:
                System.out.println( "Tipo de pintor no valido: " + tipo);
        }
		return null;
        
    }
}

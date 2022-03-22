package test;
public class Asiento {
	String color;
	int precio;
	int registro;

	void cambiarColor(String newColor) {
		if (newColor == "rojo" || newColor == "amarillo" || newColor == "verde" || newColor == "blanco" || newColor == "negro") {
			color = newColor;
		}
	}
}

package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for(int i = 0; i<= asientos.length; i++) {
			if (asientos[i] != null) {
				cantidad = cantidad + 1;
			}
		}
		return cantidad; 
	}
	
	String verificarIntegridad() {
		int a = 0;
		for(int i = 0; i<= asientos.length; i++) {
			if(asientos[i] != null) {
				if(a == 0) {
					a = asientos[i].registro;
				}
				else if(a != asientos[i].registro) {
					return("Las piezas no son originales");
				}
			}
		}
		if(a == motor.registro && motor.registro == registro) {
			return("Auto original");
		}
		else {
			return("Las piezas no son originales");
		}
	}
}

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
		for(Asiento i : asientos) {
			cantidad = cantidad + 1;
		}
		return cantidad; 
	}
	
	String verificarIntegridad() {
		int a = 0;
		for(Asiento i: asientos) {
			if (a == 0) {
				a = i.registro;
			}
			else if (a != i.registro){
				return ("Las piezas no son originales");
			}
			if (a == motor.registro && motor.registro == registro) {
				return("Auto original");
			}
		}
	}
}

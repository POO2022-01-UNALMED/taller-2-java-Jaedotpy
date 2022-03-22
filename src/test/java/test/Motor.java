package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int newRegistro) {
		 registro = newRegistro;
	}
	
	void asignarTipo(String newTipo) {
		if (newTipo == "gasolina" || newTipo == "electrico") {
			tipo = newTipo;
		}
	}
}

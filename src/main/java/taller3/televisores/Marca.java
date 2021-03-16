package taller3.televisores;

public class Marca {
	String nombre;
	
	// Constructor
	
	Marca(String nombre) {
		this.nombre = nombre;
	}
	void setNombre (String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	String getNombre () {
		return this.nombre;
	}
}

package taller3.televisores;

public class Marca {
	String nombre;
	
	// Constructor
	
	public Marca(String nombre) {
		this.nombre = nombre;
	}
	public void setNombre (String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	public String getNombre () {
		return this.nombre;
	}
}

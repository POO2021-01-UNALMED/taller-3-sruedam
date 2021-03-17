package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	public static int numTV = 0;
	
	// Constructor
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV ++;
	}
	
	// Métodos set y get de los atributos
	
	public void setMarca (Marca nuevaMarca) {
		this.marca = nuevaMarca;
	}
	public Marca getMarca () {
		return this.marca;
	}
	
	public void setControl (Control nuevoControl) {
		this.control = nuevoControl;
	}
	public Control getControl () {
		return this.control;
	}
	
	public void setPrecio (int nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
	public int getPrecio () {
		return this.precio;
	}
	
	public void setVolumen (int nuevoVolumen) {
		if (nuevoVolumen >= 0 && nuevoVolumen <= 7 && this.estado == true) {
			this.volumen = nuevoVolumen;
		}
	}
	public int getVolumen () {
		return this.volumen;
	}
	
	public void setCanal (int nuevoCanal) {
		if (nuevoCanal >= 1 && nuevoCanal <= 120 && this.estado == true) {
			this.canal = nuevoCanal;
		}
	}
	public int getCanal () {
		return this.canal;
	}
	
	// Obtener la cantidad de televisores fabricados
	
	public static void setNumTV (int nuevaCantidad) {
		TV.numTV = nuevaCantidad;
	}
	
	public static int getNumTV () {
		return TV.numTV;
	}
	
	// Prendido y apagado
	
	public void turnOn () {
		this.estado = true;
	}
	public void turnOff () {
		this.estado = false;
	}
	
	// Consultar estado
	
	public boolean getEstado () {
		return this.estado;
	}
	
	// Aumnetar y disminuir canal
	
	public void canalUp () {
		if (this.canal != 120 && this.estado == true) {
			this.canal ++;
		}
	}
	public void canalDown () {
		if(this.canal >= 1 && this.estado == true) {
			this.canal --;
		}
	}
	
	// Aumentar y disminuir volumen
	
	public void volumenUp () {
		if (this.volumen != 7 && this.estado == true) {
			this.volumen ++;
		}
	}
	public void volumenDown () {
		if(this.volumen >= 0 && this.estado == true) {
			this.volumen --;
		}
	}
}

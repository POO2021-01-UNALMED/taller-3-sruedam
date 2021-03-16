package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV = 0;
	
	// Constructor
	
	TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV ++;
	}
	
	// Métodos set y get de los atributos
	
	void setMarca (Marca nuevaMarca) {
		this.marca = nuevaMarca;
	}
	Marca getMarca () {
		return this.marca;
	}
	
	void setControl (Control nuevoControl) {
		this.control = nuevoControl;
	}
	Control getControl () {
		return this.control;
	}
	
	void setPrecio (int nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
	int getPrecio () {
		return this.precio;
	}
	
	void setVolumen (int nuevoVolumen) {
		if (nuevoVolumen >= 0 && nuevoVolumen <= 7) {
			this.volumen = nuevoVolumen;
		}
	}
	int getVolumen () {
		return this.volumen;
	}
	
	void setCanal (int nuevoCanal) {
		if (nuevoCanal >= 1 && nuevoCanal <= 120) {
			this.canal = nuevoCanal;
		}
	}
	int getCanal () {
		return this.canal;
	}
	
	// Obtener la cantidad de televisores fabricados
	
	static int getNumTV () {
		return TV.numTV;
	}
	
	// Prendido y apagado
	
	void turnOn () {
		this.estado = true;
	}
	void turnOff () {
		this.estado = false;
	}
	
	// Consultar estado
	
	boolean getEstado () {
		return this.estado;
	}
	
	// Aumnetar y disminuir canal
	
	void canalUp () {
		if (this.canal != 120 && this.estado == true) {
			this.canal ++;
		}
	}
	void canalDown () {
		if(this.canal != 1 && this.estado == true) {
			this.canal --;
		}
	}
	
	// Aumentar y disminuir volumen
	
	void volumenUp () {
		if (this.volumen != 7 && this.estado == true) {
			this.volumen ++;
		}
	}
	void volumenDown () {
		if(this.volumen != 0 && this.estado == true) {
			this.volumen --;
		}
	}
}

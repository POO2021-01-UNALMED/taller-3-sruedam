package taller3.televisores;

public class Control {
	TV tv;
	
	// Métodos set y get para tv
	
	void setTV (TV nuevoTV) {
		this.tv = nuevoTV;
	}
	TV getTV () {
		return this.tv;
	}
	
	// Método enlazar
	
	void enlazar (TV EnlaceTV) {
		this.tv = EnlaceTV;
		EnlaceTV.control = this;
	}
	
	// Prender y apagar el TV
	
	void turnOn () {
		this.tv.turnOn();
	}
	void turnOff () {
		this.tv.turnOff();
	}
	
	// Aumentar y bajar canal
	
	void canalUp () {
		this.tv.canalUp();
	}
	void canalDown () {
		this.tv.canalDown();
	}
	
	// Aumentar y bajar volumen
	
	void volumenUp () {
		this.tv.volumenUp();
	}
	void volumenDown () {
		this.tv.volumenDown();
	}
	
	// Poner canal desde el control
	
	void setCanal (int ControlCanal) {
		this.tv.setCanal(ControlCanal);
	}
}

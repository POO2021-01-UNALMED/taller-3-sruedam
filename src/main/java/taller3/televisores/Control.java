package taller3.televisores;

public class Control {
	TV tv;
	
	// Métodos set y get para tv
	
	public void setTV (TV nuevoTV) {
		this.tv = nuevoTV;
	}
	public TV getTv () {
		return this.tv;
	}
	
	// Método enlazar
	
	public void enlazar (TV EnlaceTV) {
		this.tv = EnlaceTV;
		EnlaceTV.control = this;
	}
	
	// Prender y apagar el TV
	
	public void turnOn () {
		this.tv.turnOn();
	}
	public void turnOff () {
		this.tv.turnOff();
	}
	
	// Aumentar y bajar canal
	
	public void canalUp () {
		this.tv.canalUp();
	}
	public void canalDown () {
		this.tv.canalDown();
	}
	
	// Aumentar y bajar volumen
	
	public void volumenUp () {
		this.tv.volumenUp();
	}
	public void volumenDown () {
		this.tv.volumenDown();
	}
	
	// Poner canal desde el control
	
	public void setCanal (int ControlCanal) {
		this.tv.setCanal(ControlCanal);
	}
}

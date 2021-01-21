package es.uned.dspuf;

public class PoblacionAnimal {

	private int poblacionTotal;
	private int poblacionContagiada;
	
	public PoblacionAnimal(int poblacion) {
		poblacionTotal = poblacion;
		poblacionContagiada = 0;
	}
	
	public void actualizarContagios(int incremento) {
		poblacionContagiada += incremento;
	}
	
	public int getPoblacionTotal() {
		return poblacionTotal;
	}
	
	public int getPoblacionContagiada() {
		return poblacionContagiada;
	}
	
}

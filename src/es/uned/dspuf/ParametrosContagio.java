package es.uned.dspuf;

public class ParametrosContagio {

	private double probabilidadSituacionesContagio;
	private double probabilidadContagio;
	
	public ParametrosContagio(double pSituaciones, double pContagio) {
		probabilidadContagio = pContagio;
		probabilidadSituacionesContagio = pSituaciones;
	}
	
	public double getPSituaciones() {
		return probabilidadSituacionesContagio;
	}
	
	public double getPContagio() {
		return probabilidadContagio;
	}
	
}

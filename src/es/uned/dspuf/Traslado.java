package es.uned.dspuf;

public class Traslado {

	private String id;
	private Corral origen;
	private Corral destino;
	private int cantidad;
	
	public Traslado(Corral o, Corral d, int cant) {
		cantidad = cant;
		origen = o;
		destino = d;
		id = origen.toString() + destino.toString();
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public Corral getOrigen() {
		return origen;
	}
	
	public Corral getDestino() {
		return destino;
	}
	
	public String toString() {
		return id; 
	}
	
}

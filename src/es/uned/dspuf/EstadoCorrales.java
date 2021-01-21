package es.uned.dspuf;

import java.util.ArrayList;

public class EstadoCorrales {

	private ArrayList<Corral> corrales;
	private ArrayList<Traslado> traslados;
	private VectorContagio vectorContagio;
	
	public EstadoCorrales() {
		corrales = new ArrayList<Corral>();
		traslados = new  ArrayList<Traslado>();
	}
	
	public void addVectorContagio(VectorContagio v) {
		vectorContagio = v;
	}
	
	public VectorContagio getVectorContagio() {
		return vectorContagio;
	}
	
	public ArrayList<Corral> getCorrales() {
		return corrales;
	}
	
	public  ArrayList<Traslado> getTraslados() {
		return traslados;
	}
	
	public void addCorral(Corral c) {
		corrales.add(c);
	}

	public void addTralsado(Traslado t) {
		traslados.add(t);
	}
}

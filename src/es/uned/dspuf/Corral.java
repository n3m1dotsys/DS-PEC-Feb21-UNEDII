package es.uned.dspuf;

public class Corral {

	private int id;
	private PoblacionAnimal poblacion;	
	
	public Corral(int i, PoblacionAnimal p) {
		id = i;
		poblacion = p;
	}
	
	public PoblacionAnimal getPoblacion() {
		return poblacion;
	}
	
	public int getId() {
		return id;
	}
	
	
}

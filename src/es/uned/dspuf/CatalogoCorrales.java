package es.uned.dspuf;

public class CatalogoCorrales {

	private static CatalogoCorrales instancia;	
	private EstadoCorrales estadoCorrales;
	
	public CatalogoCorrales() {
		estadoCorrales = new EstadoCorrales();
	}
	
	public static CatalogoCorrales getInstance() {
		if(instancia == null) instancia = new CatalogoCorrales();
		return  instancia;
	}
	
	public EstadoCorrales getEstadoCorrales() {
		return estadoCorrales;
	}
	
}

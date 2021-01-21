package es.uned.dspuf;

public class CatalogoCorrales {

	private static EstadoCorrales estadoCorrales = new EstadoCorrales();
	
	public static EstadoCorrales getEstadoCorrales() {
		return CatalogoCorrales.estadoCorrales;
	}
	
}

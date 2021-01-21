package es.uned.dspuf;

public class ControladorNivelSup {

	public static EstadoCorrales obtenerInformacionParaSimulacion() {
		return CatalogoCorrales.getEstadoCorrales();
	}
	
	public void registrarTraslado(Traslado t) {
		CatalogoCorrales.getEstadoCorrales().addTralsado(t);
	}
	
	public void registrarCorral(Corral c) {
		CatalogoCorrales.getEstadoCorrales().addCorral(c);
	}
	
}

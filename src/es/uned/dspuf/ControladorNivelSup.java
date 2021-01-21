package es.uned.dspuf;

public class ControladorNivelSup {

	private static ControladorNivelSup instance;
		
	public static ControladorNivelSup getInstance() {
		if (instance == null) instance = new ControladorNivelSup();
		return instance;
	}
	
	public  EstadoCorrales obtenerInformacionParaSimulacion() {
		return CatalogoCorrales.getInstance().getEstadoCorrales();
	}
	
	public void registrarTraslado(Traslado t) {
		CatalogoCorrales.getInstance().getEstadoCorrales().addTralsado(t);
	}
	
	public void registrarCorral(Corral c) {
		CatalogoCorrales.getInstance().getEstadoCorrales().addCorral(c);
	}
	
}

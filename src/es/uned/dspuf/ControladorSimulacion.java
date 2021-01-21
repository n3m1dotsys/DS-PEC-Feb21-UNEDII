package es.uned.dspuf;

public class ControladorSimulacion {

	public Simulacion realizarSimulacion(int dias) {
		EstadoCorrales datosCorrales;
		datosCorrales = ControladorNivelSup.obtenerInformacionParaSimulacion();
		Simulacion miSim = new Simulacion(dias, datosCorrales);
		miSim.iniciarCalculosSimulacion();
		return miSim;
	}
	
}

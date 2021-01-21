package es.uned.dspuf;

public class VectorContagio {
	
	private ParametrosContagio parametros;
	
	public VectorContagio(int posiblesSituaciones, int probabilidadContagio) {
		parametros = new ParametrosContagio(posiblesSituaciones, probabilidadContagio);
	}
	
	public ParametrosContagio getParametros() {
		return parametros;
	}
	
}

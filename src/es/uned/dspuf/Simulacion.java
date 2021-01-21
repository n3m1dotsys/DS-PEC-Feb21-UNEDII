package es.uned.dspuf;

import java.util.ArrayList;

public class Simulacion {

	private int dias;
	private EstadoCorrales informacionCorrales;
	private int[][] resultados;
	
	public Simulacion(int d, EstadoCorrales info) {
		this.dias = d;
		this.informacionCorrales = info;
		this.resultados = new int[d+1][info.getCorrales().size()];
	}
	
	public void iniciarCalculosSimulacion() {
		ArrayList<Traslado> traslados = informacionCorrales.getTraslados();
		ArrayList<Corral> corrales = informacionCorrales.getCorrales();
		double pr = informacionCorrales.getVectorContagio().getParametros().getPContagio();
		double E = informacionCorrales.getVectorContagio().getParametros().getPSituaciones();
		int i = 0;
		int[][] trasladosMat = new int[corrales.size()][corrales.size()];
		int[] poblacion = new int[corrales.size()];
		for(Corral c : corrales) {
			resultados[0][i] = c.getPoblacion().getPoblacionContagiada();
			poblacion[i] = c.getPoblacion().getPoblacionTotal();
			i++;
		}
		for(Traslado t : traslados) {
			trasladosMat[t.getOrigen().getId()][t.getDestino().getId()] = t.getCantidad();
		}
		for(int j= 0; j < this.dias; j++) {
			for(int k = 0; k < corrales.size(); k++) {
				int contagiados = resultados[j][k];
				int contagiadosTraslados = contagiados;
				for(int h = 0; h < informacionCorrales.getCorrales().size(); i++) {
					if(h != k) {
						contagiadosTraslados += trasladosMat[h][k] * (resultados[j][h]/poblacion[h]);
					}
				}
				resultados[j+1][k] = (int) (contagiados + pr*E*(1 - (contagiados/poblacion[k])) * contagiadosTraslados);
			}
		}
	}
	
	public int[][] getResultados(){
		return this.resultados;
	}
	
}

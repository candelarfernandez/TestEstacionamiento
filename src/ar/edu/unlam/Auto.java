package ar.edu.unlam;

import java.util.HashSet;
import java.util.Set;

public class Auto {
	private String patente;
	private Boolean habilitadoEspaciosReservados;
	private Cochera cocheraSeleccionada;
	
	public Auto(String patente, Boolean habilitadoEspaciosReservados) {
		super();
		this.patente = patente;
		this.habilitadoEspaciosReservados = habilitadoEspaciosReservados;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Boolean getHabilitadoEspaciosReservados() {
		return habilitadoEspaciosReservados;
	}
	public void setHabilitadoEspaciosReservados(Boolean habilitadoEspaciosReservados) {
		this.habilitadoEspaciosReservados = habilitadoEspaciosReservados;
	}
	public void estacionar(Cochera cochera) throws Exception {
		if(cochera.getReservada()==true) {
			if(this.habilitadoEspaciosReservados==false) {
				throw new Exception("La cochera no esta habilitada");
			}
		}cochera.setReservada(true); cochera.setOcupadoPor(this);
	}
	public Cochera buscar() {
		return this.cocheraSeleccionada;
	}
	public void salir(Cochera cochera) throws Exception {
		if(cochera.getReservada()==true) {
			cochera.setReservada(false);
			cochera.setOcupadoPor(null);
		}throw new Exception("La cochera no esta habilitada");
		
	}
	public Cochera getCocheraSeleccionada() {
		return this.cocheraSeleccionada;
	}
	public void setCocheraSeleccionada(Cochera cochera) {
		this.cocheraSeleccionada=cochera;
	}
	

}

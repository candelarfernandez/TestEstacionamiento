package ar.edu.unlam;

import java.util.Set;
import java.util.TreeSet;

public class Estacionamiento {
	private String nombre;
	private Set<Cochera> cocheras;
	

	public Estacionamiento(String nombre) {
		super();
		this.nombre = nombre;
		this.cocheras= new TreeSet<>();
	}
	public void agregarCochera(Cochera coche) {
		if(this.cocheras.size()<30) {
			this.cocheras.add(coche);
		}
	}
	public Integer getCantidadCocherasDisponibles() {
		Integer sumaDisponibles=0;
		for (Cochera cochera : cocheras) {
			if(cochera.getReservada()==false) {
				sumaDisponibles++;
			}
		}
		return sumaDisponibles;
	}
	public Integer getCantidadCocherasOcupadas() {
		Integer sumaOcupados=0;
		for (Cochera cochera : cocheras) {
			if(cochera.getReservada()==true) {
				sumaOcupados++;
			}
		}
		return 0;
	}
	public Cochera buscarCocheraDisponible() {
		for (Cochera cochera : cocheras) {
			if(cochera.getOcupadoPor()==null) {
				return cochera;
			}
		}return null;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Cochera> getCocheras() {
		return cocheras;
	}
	public void setCocheras(Set<Cochera> cocheras) {
		this.cocheras = cocheras;
	}
	


}

package ar.edu.unlam;

public class Cochera implements Comparable<Cochera>{
	private String id;
	private Boolean reservada;
	private Auto auto;
	public Cochera(String id, Boolean reservada) {
		super();
		this.id = id;
		this.reservada = reservada;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getReservada() {
		return reservada;
	}
	public void setReservada(Boolean reservada) {
		this.reservada = reservada;
	}
	public Auto getOcupadoPor() {
		return this.auto;
	}
	public void setOcupadoPor(Auto auto) {
		this.auto=auto;
	}
	@Override
	public int compareTo(Cochera o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.getId());
	}
	

}

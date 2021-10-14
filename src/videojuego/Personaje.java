package videojuego;

public abstract class Personaje {

	private String nombre;
	private Arma arma;
	private int vida;
	private int danioEspecifico;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDanioEspecifico() {
		return danioEspecifico;
	}
	public void setDanioEspecifico(int danioEspecifico) {
		this.danioEspecifico = danioEspecifico;
	}
	
	public abstract int atacar();
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", arma=" + arma + ", vida=" + vida + ", danioEspecifico="
				+ danioEspecifico + "]";
	}
	
	
	
	
	
}

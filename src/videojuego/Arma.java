package videojuego;

public class Arma {

	private int danio = (int)(Math.random() * 50) + 50;
	private String tipo;
	
	
	
	public static String ESPADA = "espada";
	public static String ARCO = "arco";
	public static String HECHIZO = "hechizo";
	public static String REZO = "rezo";
	
	
	
	public int getDanio() {
		return danio;
	}
	public void setDanio(int danio) {
		this.danio = danio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Arma [danio=" + danio + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
}

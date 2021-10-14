package videojuego;

public class Curandero extends Personaje{

	@Override
	public int atacar() {
		int danio = getArma().getDanio();
		if (getArma().getTipo() == "rezo") {
			danio += getDanioEspecifico();
		}
		
		return danio;
		
	}

}

package videojuego;

public class Guerrero extends Personaje {

	@Override
	public int atacar() {
		int danio = getArma().getDanio();
		if (getArma().getTipo() == "espada" || (getArma().getTipo() == "arco")) {
			danio += getDanioEspecifico();
		}
		
		return danio;
		
	}

	
}

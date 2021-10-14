package videojuego;

public class Mago extends Personaje {

	@Override
	public int atacar() {
		// TODO Auto-generated method stub
		int danio = getArma().getDanio();
		if (getArma().getTipo() == "hechizo") {
			danio += getDanioEspecifico();
		}
		
		return danio;
	}
	
	

	
}

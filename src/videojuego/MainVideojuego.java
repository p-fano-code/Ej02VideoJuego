package videojuego;

import java.util.Scanner;

public class MainVideojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		
		Personaje mago1 = new Mago();
		Arma hechizo1 = new Arma();
		hechizo1.setTipo("hechizo");
		
		mago1.setNombre("Conan");
		mago1.setVida(400);
		mago1.setArma(hechizo1);
		mago1.setDanioEspecifico(0);
		//mago1.atacar();
		
		Personaje guerrero1 = new Guerrero();
		Arma espada1 = new Arma();
		espada1.setTipo("espada");
		
		guerrero1.setNombre("Ragnar");
		guerrero1.setVida(420);
		guerrero1.setArma(espada1);
		guerrero1.setDanioEspecifico(0);
		//guerrero1.atacar();
		
		//COMBATE
		
		System.out.println(guerrero1.getNombre() + " tiene " + guerrero1.getVida() + " puntos de vida.");
		System.out.println(mago1.getNombre() + " tiene " + mago1.getVida() + " puntos de vida.");
		System.out.println("Empieza el combate.");
		String enter;
		
		while( mago1.getVida() >= 0 || guerrero1.getVida() >= 0) {
			
			System.out.println("--Escribe <atacar> para atacar");
			enter = teclado.next();
			
			System.out.println(mago1.getNombre() + " ataca!!!");
			guerrero1.setVida(guerrero1.getVida()- mago1.atacar());
			System.out.println(guerrero1.getNombre() + " recibe " + mago1.atacar() + " puntos de daño.");
			System.out.println(guerrero1.getNombre() + " tiene "+ guerrero1.getVida() + " puntos de vida");
			
			if (guerrero1.getVida() <= 0) {
				
				System.out.println(guerrero1.getNombre() +" fue derrotado");
				System.out.println(mago1.getNombre()+ " GANA LA PARTIDA");
				break;
			}
			
			
			System.out.println(guerrero1.getNombre() + " ataca!!!");
			mago1.setVida(mago1.getVida()- guerrero1.atacar());
			System.out.println(mago1.getNombre() + " recibe " + guerrero1.atacar() + " puntos de daño.");
			System.out.println(mago1.getNombre() + " tiene "+ mago1.getVida() + " puntos de vida");
			
			if (mago1.getVida() <= 0) {
				
				System.out.println(mago1.getNombre() +" fue derrotado");
				System.out.println(guerrero1.getNombre()+ " GANA LA PARTIDA");
				break;
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}

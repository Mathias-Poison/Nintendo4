package test;

import model.Console;

import model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console console1 = new Console ("Gameboy");
		Console console2 = new Console ("PS1");
		Console console3 = new Console ("Xbox");
		Console console4 = new Console ("Switch");
		Console console5 = new Console ("Gamecube");
		
		Jeu jeu1 = new Jeu ("Pokemon",console1);
		Jeu jeu2 = new Jeu ("Digimon",console2);
		Jeu jeu3 = new Jeu ("Halo",console3);
		Jeu jeu4 = new Jeu ("MarioKart",console4);
		Jeu jeu5 = new Jeu ("Metroid",console5);
		
		
		
	}

}

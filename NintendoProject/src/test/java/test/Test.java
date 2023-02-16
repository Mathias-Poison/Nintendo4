package test;

import model.Client;
import model.Console;

import model.Jeu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;

public class Test {
	static List<Achat> listAchat1 = new ArrayList(); 
	static List<Achat> listAchat2 = new ArrayList(); 
	static List<Achat> listAchat3 = new ArrayList(); 
	
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
		
		Achat achat1 = new Achat (jeu1,LocalDate.now(),45.0);
		Achat achat2 = new Achat (jeu2,LocalDate.now(),45.0);
	
		
		System.out.println(achat1);
		
		Client c1 = new Client("Ali","Baba");
		Client c2 = new Client("Baba","Haut-rom");
		Client c3 = new Client("Baba","Cool");
		
		c1.getAchats().add(achat1);
		c1.getAchats().add(achat2);
		
	}

}

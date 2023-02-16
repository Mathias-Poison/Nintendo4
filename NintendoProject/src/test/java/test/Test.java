package test;

import model.Adresse;
import model.Boutique;
import model.Console;
import model.Jeu;

import java.time.LocalDate;

import model.Achat;

public class Test {

	public static void main(String[] args) {
		
		Console console1 = new Console ("Gameboy", 99, "12-06-1999");
		Console console2 = new Console ("PS1", 149, "14-10-2000");
		Console console3 = new Console ("Xbox", 159, "01-05-2001");
		Console console4 = new Console ("Switch", 250, "21-09-2003");
		Console console5 = new Console ("Gamecube", 199, "08-07-2003");
		
		Jeu jeu1 = new Jeu ("Pokemon",console1);
		Jeu jeu2 = new Jeu ("Digimon",console2);
		Jeu jeu3 = new Jeu ("Halo",console3);
		Jeu jeu4 = new Jeu ("MarioKart",console4);
		Jeu jeu5 = new Jeu ("Metroid",console5);
		
		Adresse adr = new Adresse (5, "rue des Irlandais", "Nantes");
		Boutique boutique = new Boutique ("world of games", adr);
		Achat achat1 = new Achat (jeu1,LocalDate.now(),45.0);
		
		System.out.println(achat1);
		
	}

}

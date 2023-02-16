package test;

import model.Client;
import model.Adresse;
import model.Boutique;
import model.Console;
import model.Hybride;
import model.Jeu;
import model.Portable;
import model.Salon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;

public class Test {
	static List<Achat> listAchat1 = new ArrayList(); 
	static List<Achat> listAchat2 = new ArrayList(); 
	static List<Achat> listAchat3 = new ArrayList(); 
	
	public static void main(String[] args) {
		
		Console console1 = new Portable ("Gameboy", 99, "12-06-1999");
		Console console2 = new Salon ("PS1", 149, "14-10-2000");
		Console console3 = new Salon ("Xbox", 159, "01-05-2001");
		Console console4 = new Hybride ("Switch", 250, "21-09-2003");
		Console console5 = new Salon ("Gamecube", 199, "08-07-2003");
		
		
		Adresse adr = new Adresse (5, "rue des Irlandais", "Nantes");
		Boutique boutique = new Boutique ("world of games", adr);
		
		Jeu jeu1 = new Jeu ("Pokemon",console1, boutique);
		Jeu jeu2 = new Jeu ("Digimon",console2, boutique);
		Jeu jeu3 = new Jeu ("Halo",console3, boutique);
		Jeu jeu4 = new Jeu ("MarioKart",console4, boutique);
		Jeu jeu5 = new Jeu ("Metroid",console5, boutique);
		
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

package dz.io.serialisation.pack;

import java.io.Serializable;

public class Game implements Serializable {
	private String nom;
	private String style;
	private double prix;

	public Game() {
	}

	public Game(String nom, String style, double prix) {
		this.nom = nom;
		this.style = style;
		this.prix = prix;
	}

	public String toString() {
		return "nom du jeu :" + this.nom + "\n  style de jeu :" + this.style + "\n  prix du jeu :" + this.prix;
	}
}

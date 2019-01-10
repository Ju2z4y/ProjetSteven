package cgi.stevenProjet.bean;

import cgi.stevenProjet.enums.VoitureEnum;

public class Voiture extends Vehicule{
	private int nbRoues = 4;
	private int nbPhares = 4;
	private int nbRetro = 3;
	private Boolean decapotable = null;
	private VoitureEnum marque;

	
	public Voiture(String immatriculation, String moteur, VoitureEnum marque) {
		super(immatriculation, moteur);
		this.marque = marque;
	}
	
	@Override
	public String toString() {
		String reponse = "Immatriculation : " + immatriculation + "\n";
		reponse += "Moteur : " + moteur  + "\n";
		reponse += "Nombre de roues : " + nbRoues + "\n";
		reponse += "Nombre de phares : " + nbPhares + "\n";
		reponse += "Nombre de Retroviseurs : " + nbRetro + "\n";
		reponse += "Décapotable ? " + decapotable + "\n";
		reponse += "Marque : " + marque.toString() + "\n";
		return reponse;
	}


	public int getNbPhares() {
		return nbPhares;
	}

	public void setNbPhares(int nbPhares) {
		this.nbPhares = nbPhares;
	}

	public int getNbRoues() {
		return nbRoues;
	}

	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}
	
	@Override
	public String demarrer() {
		String rep = "La voiture démarre";
		return rep;
	}

	@Override
	public String rouler() {
		String rep = "La voiture roule";
		return rep;
	}

	public int getNbRetro() {
		return nbRetro;
	}

	public void setNbRetro(int nbRetro) {
		this.nbRetro = nbRetro;
	}

	public Boolean getDecapotable() {
		return decapotable;
	}

	public void setDecapotable(Boolean decapotable) {
		this.decapotable = decapotable;
	}

	public VoitureEnum getMarque() {
		return marque;
	}

	public void setMarque(VoitureEnum marque) {
		this.marque = marque;
	}
	
	

}

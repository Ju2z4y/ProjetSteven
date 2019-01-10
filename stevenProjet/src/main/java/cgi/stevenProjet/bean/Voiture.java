package cgi.stevenProjet.bean;

public class Voiture extends Vehicule{
	private int nbRoues = 4;
	private int nbPhares = 4;
	private int nbRetro = 3;
	private Boolean decapotable = null;

	
	public Voiture(String immatriculation, String moteur) {
		super(immatriculation, moteur);
	}
	
	@Override
	public String toString() {
		String reponse = "Immatriculation : " + immatriculation + "\n";
		reponse += "Moteur : " + moteur  + "\n";
		reponse += "Nombre de roues : " + nbRoues + "\n";
		reponse += "Nombre de phares : " + nbPhares + "\n";
		reponse += "Nombre de Retroviseurs : " + nbRetro + "\n";
		reponse += "Décapotable ? " + decapotable + "\n";
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
	

	

}

package cgi.stevenProjet.bean;

public class Moto extends Vehicule{
	private int nbRoues = 2;
	private int nbPhares = 2;
	private int nbRetro = 2;
	
	public Moto(String immatriculation, String moteur) {
		super(immatriculation, moteur);
	}
	
	@Override
	public String toString() {
		String reponse = "Immatriculation : " + immatriculation + "\n";
		reponse += "Moteur : " + moteur  + "\n";
		reponse += "Nombre de roues : " + nbRoues + "\n";
		reponse += "Nombre de phares : " + nbPhares + "\n";
		reponse += "Nombre de rétroviseurs : " + nbRetro + "\n";
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
		String rep = "La moto démarre";
		return rep;
	}

	@Override
	public String rouler() {
		String rep = "La moto roule";
		return rep;
	}
	

}

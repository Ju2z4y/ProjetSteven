package cgi.stevenProjet.bean;

public class Vehicule {
	
	private String immatriculation;
	private String moteur;

	
	public Vehicule(String immatriculation, String moteur) {
		this.immatriculation = immatriculation;
		this.moteur = moteur;
	}
	

	public String toString() {
		String reponse = "Immatriculation : " + immatriculation + "\n";
		reponse += "Moteur : " + moteur  + "\n";
		return reponse;
	}


	public String getImmatriculation() {
		return immatriculation;
	}


	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	public String getMoteur() {
		return moteur;
	}


	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}
	
	
	

}

package cgi.stevenProjet.bean;

public class Voiture {
	
	private String moteur = "4 cynlindres";
	private int roues = 4;
	private int portes;
	private Boolean decapotale = null;
	
	public Voiture() {
		
	}
	
	public Voiture(int portes, Boolean decapotable) {
		super();
		this.portes = portes;
		this.decapotale = decapotable;
	}
	
	public String toString() {
		String reponse = "Moteur : " + moteur + "\n";
		reponse += "Roues : " + roues  + "\n";
		reponse += "Portes : " + portes  + "\n";
		reponse += "Décapotable : " + decapotale  + "\n";
		reponse += "----------------------\n";
		return reponse;
	}
	
	
	public String getMoteur() {
		return moteur;
	}
	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}
	public int getRoues() {
		return roues;
	}
	public void setRoues(int roues) {
		this.roues = roues;
	}
	public int getPortes() {
		return portes;
	}
	public void setPortes(int portes) {
		this.portes = portes;
	}
	public boolean isDecapotale() {
		return decapotale;
	}
	public void setDecapotale(boolean decapotale) {
		this.decapotale = decapotale;
	}
	

}

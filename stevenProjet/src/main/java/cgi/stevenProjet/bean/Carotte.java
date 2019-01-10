package cgi.stevenProjet.bean;

import cgi.stevenProjet.interfaces.Epluchable;

public class Carotte extends Legume implements Epluchable{

	private double tauxEpluchure = 0.01;
	
	public Carotte(double poids, String variete) {
		super(poids, variete);

	}

	public double eplucher() {
	
		double poidsEpluchure = this.getTauxEpluchure() * this.getPoids();
		this.setPoids(this.getPoids()-poidsEpluchure);
		return poidsEpluchure;
	}

	public double getTauxEpluchure() {
		return tauxEpluchure;
	}

	public void setTauxEpluchure(double tauxEpluchure) {
		this.tauxEpluchure = tauxEpluchure;
	}

	
	
}

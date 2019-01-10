package cgi.stevenProjet.bean;

public class Patate extends Legume{

	private double tauxEpluchure = 0.2;
	
	public Patate(double poids, String variete) {
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

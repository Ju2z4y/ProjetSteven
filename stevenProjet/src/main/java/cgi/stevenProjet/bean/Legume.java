package cgi.stevenProjet.bean;

public class Legume {
	private double poids;
	private String variete;
	
	
	public Legume(double poids, String variete) {
		this.poids = poids;
		this.variete = variete;
	}

	public  double getPoids() {
		return poids;
	}

	public void setPoids(double d) {
		this.poids = d;
	}

	public String getVariete() {
		return variete;
	}

	public void setVariete(String variete) {
		this.variete = variete;
	}
}

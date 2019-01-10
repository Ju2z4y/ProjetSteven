package cgi.stevenProjet.bean;

import java.util.ArrayList;

public class Soupe {
	protected double poidsEpluchure;
	protected ArrayList<Legume> listeLegume = new ArrayList<Legume>();
	protected ArrayList<Tomate> listeTomate = new ArrayList<Tomate>();
	protected ArrayList<Patate> listePatate = new ArrayList<Patate>();
	protected ArrayList<Carotte> listeCarotte = new ArrayList<Carotte>();
	
	public Soupe() {
		
	}
	
	public double getPoidsEpluchure() {
		return poidsEpluchure;
	}
	public void setPoidsEpluchure(double poidsEpluchure) {
		this.poidsEpluchure = poidsEpluchure;
	}
	public ArrayList<Legume> getListeLegume() {
		return listeLegume;
	}
	public void setListeLegume(ArrayList<Legume> listeLegume) {
		this.listeLegume = listeLegume;
	}

	public ArrayList<Tomate> getListeTomate() {
		return listeTomate;
	}
	public void Tomate(ArrayList<Tomate> listeTomate) {
		this.listeTomate = listeTomate;
	}

	public ArrayList<Patate> getListePatate() {
		return listePatate;
	}
	public void Patate(ArrayList<Patate> listePatate) {
		this.listePatate = listePatate;
	}
	
	public ArrayList<Carotte> getListeCarotte() {
		return listeCarotte;
	}
	public void Carotte(ArrayList<Carotte> listeCarotte) {
		this.listeCarotte = listeCarotte;
	}
	
	public void addLegume(Legume leg) {
		this.listeLegume.add(leg);
	}
	
	public String toString() {
		double poidsTotalLegume = 0;
		double poidsTotalTomate = 0;
		double poidsTotalPatate = 0;
		double poidsTotalCarotte = 0;
		String resultat = "";
		String resLeg = "";
		String resLeg = "";
		String resultat = "";
		
		for (Legume leg : listeLegume) {
			poidsTotalLegume += leg.getPoids();
		}
		
		for (Tomate tom : listeTomate) {
			poidsTotalTomate += tom.getPoids();
		}
		for (Patate pat : listePatate) {
			poidsTotalPatate += pat.getPoids();
		}
		for (Carotte car : listeCarotte) {
			poidsTotalCarotte += car.getPoids();
		}
		
		
//		resultat = "" +poidsTotalLegume + " g de soupe :" + "\n";
		
		resLeg = "" +poidsTotalLegume + " g de soupe :" + "\n";
		
		resultat = ""+
		return resultat;
		
	}
	
	
	
	
	
	
//	RESULTAT ATTENDU :
//
//	    500 g de soupe :
//
//	        3 pour 100g Tomates : 2 var1, 1var2
//
//	        4 pour 50g Carottes : 1 var1, 3 var2
//
//	        6 pour 300g Patate : 1 var1, 1var2, 1var3
//
//	    Poids d épluchure totale pour la soupe : 100g
	
}

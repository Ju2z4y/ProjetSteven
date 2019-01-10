package cgi.stevenProjet.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Soupe {
	protected double poidsEpluchure;
	protected ArrayList<Legume> listeLegume = new ArrayList<Legume>();

	
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
	
	public void addLegume(Legume leg) {
		this.listeLegume.add(leg);
	}
	
	public String toString() {
		String resultat;
		Map<String, Integer> tomates = new HashMap<String, Integer>();
		Map<String, Integer> carottes = new HashMap<String, Integer>();
		Map<String, Integer> patates = new HashMap<String, Integer>();
		int nbTomate = 0;
		double poidsTomate = 0;
		int nbCarotte = 0;
		double poidsCarotte = 0;
		int nbPatate = 0;
		double poidsPatate = 0;
		
		
		for (Legume leg : listeLegume) {
			if (leg instanceof Tomate) {
				nbTomate++;
				poidsTomate += leg.getPoids();
				if (tomates.get(leg.getVariete()) == null) {
					tomates.put(leg.getVariete(), 1);
				} else {
					int incr = tomates.get(leg.getVariete());
					incr ++;
					tomates.replace(leg.getVariete(), incr);
				}
			}
			if (leg instanceof Carotte) {
				nbCarotte++;
				poidsCarotte += leg.getPoids();
				if (carottes.get(leg.getVariete()) == null) {
					carottes.put(leg.getVariete(), 1);
				} else {
					int incr = carottes.get(leg.getVariete());
					incr ++;
					carottes.replace(leg.getVariete(), incr);
				}
			}
			if (leg instanceof Patate) {
				nbPatate++;
				poidsPatate += leg.getPoids();
				if (patates.get(leg.getVariete()) == null) {
					patates.put(leg.getVariete(), 1);
				} else {
					int incr = patates.get(leg.getVariete());
					incr ++;
					patates.replace(leg.getVariete(), incr);
				}
			}
		}
		resultat = (poidsCarotte + poidsPatate + poidsTomate) + "g de soupe : \n" + 
		nbTomate + " tomates pour " + poidsTomate + "g. Variétés = ";
		
		int incr2 = 0;
		for (Map.Entry<String,Integer> e : tomates.entrySet()) {
			resultat += (incr2==0?"":", ") + e.getKey() + " : " + e.getValue();
			incr2++;
		}
		
		resultat += "\n" + nbCarotte + " carotte pour " + poidsCarotte + "g. Variétés = ";
		
		incr2 = 0;
		for (Map.Entry<String,Integer> e : carottes.entrySet()) {
			resultat += (incr2==0?"":", ") + e.getKey() + " : " + e.getValue();
			incr2++;
		}
		
		resultat += "\n" + nbPatate + " patates pour " + poidsPatate + "g. Variétés = ";
		
		incr2 = 0;
		for (Map.Entry<String,Integer> e : patates.entrySet()) {
			resultat += (incr2==0?"":", ") + e.getKey() + " : " + e.getValue();
			incr2++;
		}
		
		resultat += "\nPoids des épluchures total pour la soupe : " + this.getPoidsEpluchure() +"g\n\n";
		
		return resultat;
		
	}
	
	
	
	
	
	
//	RESULTAT ATTENDU :
//
//	    500 g de soupe :
//
//	        3 Tomates pour 100g  : 2 var1, 1var2
//
//	        4 pour 50g Carottes : 1 var1, 3 var2
//
//	        6 pour 300g Patate : 1 var1, 1var2, 1var3
//
//	    Poids d épluchure totale pour la soupe : 100g
	
}

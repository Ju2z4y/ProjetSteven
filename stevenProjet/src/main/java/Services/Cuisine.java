package Services;

import java.util.ArrayList;

import cgi.stevenProjet.bean.Legume;
import cgi.stevenProjet.bean.Soupe;
import cgi.stevenProjet.interfaces.Epluchable;


public class Cuisine {
	
	public Soupe cuisiner(ArrayList<Legume> listeLegumes) {
		double poidsTotal = 0;
		Soupe soupe = new Soupe();
		for (Legume leg : listeLegumes) {
			if (leg instanceof Epluchable) {
				poidsTotal += ((Epluchable) leg).eplucher();
			}
		soupe.addLegume(leg);
		
		}
		soupe.setPoidsEpluchure(poidsTotal);
		return soupe;
	}
}

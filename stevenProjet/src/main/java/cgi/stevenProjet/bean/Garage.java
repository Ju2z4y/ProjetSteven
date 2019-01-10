package cgi.stevenProjet.bean;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicule> mesVeh;
	public ArrayList<Moto> motos;
	private ArrayList<Voiture> voitures;
	
	public Garage (ArrayList<Vehicule> garage) {
		this.mesVeh = garage;
	}
	
	public void trier() {
        for (Vehicule veh : mesVeh) {
        	if (veh instanceof Voiture) {
        		voitures.add((Voiture) veh);
        	} else if (veh instanceof Moto) {
        		ajouterMoto((Moto)veh);
        	}

		}
	}

	public ArrayList<Vehicule> getGarage() {
		return mesVeh;
	}

	public void setGarage(ArrayList<Vehicule> garage) {
		this.mesVeh = garage;
	}

	public ArrayList<Moto> getMotos() {
		return motos;
	}

	public void setMotos(ArrayList<Moto> motos) {
		this.motos = motos;
	}

	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	public void ajouterMoto(Moto moto) {
		motos.add(moto);
	}
	
	

}

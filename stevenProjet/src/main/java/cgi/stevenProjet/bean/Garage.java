package cgi.stevenProjet.bean;

import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicule> mesVeh;
	private ArrayList<Moto> motos = new ArrayList<Moto>();
	private ArrayList<Voiture> voitures = new ArrayList<Voiture>();
	
	public Garage (ArrayList<Vehicule> garage) {
		this.mesVeh = garage;
	}
	
	public void trier() {
        for (Vehicule veh : mesVeh) {
        	if (veh instanceof Voiture) {
        		voitures.add((Voiture) veh);
        	} else if (veh instanceof Moto) {
        		motos.add((Moto) veh);
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
	
	
	

}

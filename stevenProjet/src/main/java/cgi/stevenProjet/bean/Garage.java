package cgi.stevenProjet.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Garage {
	
	private ArrayList<Vehicule> mesVeh;
	private ArrayList<Vehicule> motos = new ArrayList<Vehicule>();
	private ArrayList<Vehicule> voitures = new ArrayList<Vehicule>();
	private Map<String, ArrayList<Vehicule>> map = new HashMap<String, ArrayList<Vehicule>>();
	private ArrayList<ArrayList<Vehicule>> list = new ArrayList<ArrayList<Vehicule>>();
	
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
	
	public void rassembler() {
		map.put("ListeMotos", motos);
		map.put("ListeVoitures", voitures);
	}

	public ArrayList<Vehicule> getGarage() {
		return mesVeh;
	}

	public void setGarage(ArrayList<Vehicule> garage) {
		this.mesVeh = garage;
	}

	public ArrayList<Vehicule> getMotos() {
		return motos;
	}

	public void setMotos(ArrayList<Vehicule> motos) {
		this.motos = motos;
	}

	public ArrayList<Vehicule> getVoitures() {
		return voitures;
	}

	public void setVoitures(ArrayList<Vehicule> voitures) {
		this.voitures = voitures;
	}

	public ArrayList<ArrayList<Vehicule>> getList() {
		return list;
	}

	public void setList(ArrayList<ArrayList<Vehicule>> list) {
		this.list = list;
	}

	public Map<String, ArrayList<Vehicule>> getMap() {
		return map;
	}

	public void setMap(Map<String, ArrayList<Vehicule>> map) {
		this.map = map;
	}
	
	
	

}

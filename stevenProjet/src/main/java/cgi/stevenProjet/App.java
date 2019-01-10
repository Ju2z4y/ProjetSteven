package cgi.stevenProjet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cgi.stevenProjet.bean.Garage;
import cgi.stevenProjet.bean.Moto;
import cgi.stevenProjet.bean.Vehicule;
import cgi.stevenProjet.bean.Voiture;
import cgi.stevenProjet.enums.VoitureEnum;

/**
 * Hello world!
 *t
 */

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "App lauched\n------------------------\n" );
        
        Vehicule vehicule = new Vehicule("5685", "V12");
        Vehicule vehicule2 = new Vehicule("8569", "V3");
        Vehicule vehicule3 = new Moto("1513", "V4");
        Vehicule vehicule4 = new Voiture("1513", "V8", VoitureEnum.PEUGEOT);
        Moto moto1 = new Moto("6164", "V15");
        Vehicule voiture = new Voiture("65264", "VHJDJ", VoitureEnum.RENAULT);
        
        ArrayList<Vehicule> listVeh = new ArrayList<Vehicule>();
        listVeh.add(vehicule);
        listVeh.add(vehicule2);
        listVeh.add(vehicule3);
        listVeh.add(vehicule4);
        listVeh.add(moto1);
        listVeh.add(voiture);
        
        Garage garage = new Garage(listVeh);
        
        garage.trier();
        
        garage.rassembler();
        
        Map<String, ArrayList<Vehicule>> map = garage.getMap();
        
        List<Vehicule> list = map.get("ListeMotos");
        
        for (Vehicule veh : list) {
			System.out.println(veh);
		}
        
//        for (Vehicule veh : garage.getMotos()) {
//			System.out.println(veh);
//		}
        
        
        
    }
}

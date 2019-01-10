package cgi.stevenProjet;

import java.util.ArrayList;

import cgi.stevenProjet.bean.Moto;
import cgi.stevenProjet.bean.Vehicule;
import cgi.stevenProjet.bean.Voiture;

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
        Vehicule vehicule4 = new Voiture("1513", "V8");
        Moto moto1 = new Moto("6164", "V15");
        
        ArrayList<Vehicule> garage = new ArrayList<Vehicule>();
        garage.add(vehicule);
        garage.add(vehicule2);
        garage.add(vehicule3);
        garage.add(vehicule4);
        garage.add(moto1);
        
        ArrayList<Moto> motos = new ArrayList<Moto>();
        
        for (Vehicule veh : garage) {
        	if (veh instanceof Moto) {
        		motos.add((Moto) veh);
        	}

		}
        
        for (Moto moto : motos) {
        	System.out.println(moto.toString());
		}
        
    }
}

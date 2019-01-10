package cgi.stevenProjet;

import java.util.ArrayList;

import Services.Cuisine;
//import cgi.stevenProjet.bean.Garage;
//import cgi.stevenProjet.bean.Moto;
//import cgi.stevenProjet.bean.Vehicule;
//import cgi.stevenProjet.bean.Voiture;
//import cgi.stevenProjet.enums.VoitureEnum;
import cgi.stevenProjet.bean.Legume;
import cgi.stevenProjet.bean.Carotte;
import cgi.stevenProjet.bean.Patate;
import cgi.stevenProjet.bean.Soupe;
import cgi.stevenProjet.bean.Tomate;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "App lauched\n------------------------\n" );
        System.out.println( "Soupe en cours\n------------------------\n" );
        
        Cuisine cuisine = new Cuisine();

        

        Tomate tomate1 = new Tomate(50, "Coeur de boeuf");

        Tomate tomate2 = new Tomate(15, "Corazon");

        Tomate tomate3 = new Tomate(20, "Corazon");

        

        Carotte carotte1 = new Carotte(5, "Nantaise");

        Carotte carotte2 = new Carotte(10, "Toulon");

        Carotte carotte3 = new Carotte(15, "Bercilium");

        Carotte carotte4 = new Carotte(15, "Ortolana");

        

        Patate patate1 = new Patate(80, "Charlotte");

        Patate patate2 = new Patate(160, "Blanche");

        

        ArrayList<Legume> panierDeLegume = new ArrayList<Legume>();

        

        panierDeLegume.add(tomate1);

        panierDeLegume.add(tomate2);

        panierDeLegume.add(tomate3);

        panierDeLegume.add(carotte1);

        panierDeLegume.add(carotte2);

        panierDeLegume.add(carotte3);

        panierDeLegume.add(carotte4);

        panierDeLegume.add(patate1);

        panierDeLegume.add(patate2);

        

        Soupe maSoupe = cuisine.cuisiner(panierDeLegume);

        

        System.out.println(maSoupe);

//        2.créer la classe Soupe (liste de légumes + part d'épluchures)
//        1.créer l'interface d'épluchure qui implémente éplucher()
//        3.créer une classe cuisine et cuisiner().
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Vehicule vehicule = new Vehicule("5685", "V12");
//        Vehicule vehicule2 = new Vehicule("8569", "V3");
//        Vehicule vehicule3 = new Moto("1513", "V4");
//        Vehicule vehicule4 = new Voiture("1513", "V8", VoitureEnum.PEUGEOT);
//        Moto moto1 = new Moto("6164", "V15");
//        Vehicule voiture = new Voiture("65264", "VHJDJ", VoitureEnum.RENAULT);
//        
//        ArrayList<Vehicule> listVeh = new ArrayList<Vehicule>();
//        listVeh.add(vehicule);
//        listVeh.add(vehicule2);
//        listVeh.add(vehicule3);
//        listVeh.add(vehicule4);
//        listVeh.add(moto1);
//        listVeh.add(voiture);
//        
//        Garage garage = new Garage(listVeh);
//        
//        garage.trier();
//        
//        for (Vehicule veh : garage.getMotos()) {
//			System.out.println(veh);
//		}
//        
//        
//        
    }
}

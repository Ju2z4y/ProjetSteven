package cgi.stevenProjet;

import cgi.stevenProjet.bean.Moto;
import cgi.stevenProjet.bean.Vehicule;
import cgi.stevenProjet.bean.Voiture;

/**
 * Hello world!
 *
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
        
        System.out.println(vehicule.toString());
        System.out.println(vehicule2.toString());
        System.out.println(vehicule3.toString());
        System.out.println(vehicule4.toString());
        System.out.println(moto1.toString());
        
    }
}

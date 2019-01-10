package cgi.stevenProjet;

import cgi.stevenProjet.bean.Vehicule;

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
        
        System.out.println(vehicule.toString());
        System.out.println(vehicule2.toString());
        
    }
}

package cgi.stevenProjet;

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
        
        Voiture voiture = new Voiture();
        Voiture voiture2 = new Voiture(5, true);
        
        System.out.println(voiture.toString());
        System.out.println(voiture2.toString());
        
    }
}

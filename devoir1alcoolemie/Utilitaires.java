/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gg.sim.mzevallos.devoir1alcoolemie;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jflandry
 */
public class Utilitaires {
    public static long lireEntier(String invite){
        Scanner sc = new Scanner(System.in);
        
        boolean lire = true;
        long l = 0;
        
        while (lire) {
            //https://www.w3schools.com/java/java_try_catch.asp
            System.out.print(invite);
            try {
               l = sc.nextInt();
               lire = false;
            }
            catch(Exception e) {
               System.out.println("ERREUR! Le format du nombre entier entré est invalide (exemple 123).");
               //effacer la valeur entrée par l'utilisateur
               sc.next(); 
               
            }
        }
        return l;
    }
    public static double lireReel(String invite){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        boolean lire = true;
        double d = 0.0f;
        
        while (lire) {
            //https://www.w3schools.com/java/java_try_catch.asp
            System.out.print(invite);
            try {
               d = sc.nextDouble();
               lire = false;
            }
            catch(Exception e) {
               System.out.println("ERREUR! Le format du nombre réel entré est invalide (exemple 3.75).");
               //effacer la valeur entrée par l'utilisateur
               sc.next(); 
               
            }
        }
        return d;
    }
    
    public static int genererAleatoire(int nb, int min){
        // référence: https://www.w3schools.com/java/java_math.asp
        // Cette methode génère nb nombre(s) entier(s) entre min et (min+nb-1)
        return min + (int)(Math.random() * nb);
        
    }
    
}

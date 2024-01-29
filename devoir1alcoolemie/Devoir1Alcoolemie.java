package gg.sim.mzevallos.devoir1alcoolemie;

import java.util.Locale;

/**
 *
 * @author Marcelo
 */
public class Devoir1Alcoolemie {

    public static void main(String[] args) {
        System.out.println("Devoir 1 - ALCOOLÉMIE par Marcelo");
        
        //placer uniquement votre code ici..
        
        double volume = Utilitaires.lireReel("\nEntrez V le volume d'alcool bus en ml: ");
        
        if(volume == 0) {
                System.out.println("\nMerci et bonne journée!");
                System.exit(0);
            }
        
        float sexe = Utilitaires.lireEntier("Est-ce que vous êtes un homme <0> ou femme <1>: ");
        
        // Si c'est un homme.
        if (sexe == 0){
            
            // Les variables
            double taux = Utilitaires.lireReel("Entrez T le degré d'alcool en pourcentage: ");
            double masse = Utilitaires.lireReel("Entrez M votre poids en kg: ");
            double reponse = (volume*taux*0.8)/(7*masse);
            double arrondissement = Math.round(reponse*1000.0)/1000.0;
            
            // Les choix
            System.out.println("Votre taux d'alcool est de " + arrondissement);
            System.out.println("\nSélectionner l'un cas suivanrs: "
                    + "\n<0> Vous avez moins de 22 ans."
                    + "\n<1> Vous êtes un apprenti conducteur."
                    + "\n<2> Vous avez un permis probatoire."
                    + "\n<3> Aucun de ces choix");
            float c = Utilitaires.lireEntier("\nEnrez votre choix: ");
            
            // Les conditions
             if (c == 0) {
                System.out.println("\nConducteur moins de 22 ans - taux de " + arrondissement +
                        "\n- Suspension immédiate du permis de 90 jours."
                        + "\n- Perte de 4 points d'inaptitude."
                        + "\n- Amende entre 300$ à 600$");
            } else if (c == 1){
                System.out.println("\nApprenti conducteur - taux de " + arrondissement
                        + "\n- Suspension immédiate du permis de 90 jours."
                        + "\n- Perte de 4 points d'inaptitude."
                        + "\n- Amende entre 300$ à 600$");
            } else if (c == 2){
                System.out.println("\nPermis probatoire - taux de " + arrondissement
                        + "\n- Suspension immédiate du permis de 90 jours."
                        + "\n- Perte de 4 points d'inaptitude."
                        + "\n- Amende entre 300$ à 600$");
            } else if (c == 3){
                if (Math.round(reponse*100/100)>= 0.8){
                    System.out.println("\nConducteur de 22 ans et plus - Taux égal ou supérieur à 0.08 mg/100ml"
                        + "\n- Suspension immédiate du permis de 24 heures."
                        + "\n- Saisie immédiate du véhicule de 30 jours.");
                }else if (arrondissement < 0.8){
                    System.out.println("\nConducteur de 22 ans et plus"
                      + "\nVotre écart avec le taux de 0.8 mG/100ml est de " + (0.08-arrondissement)
                      + "\nVotre consommation est raisonnable");  
                }    
            }
             System.out.println("\n Merci et bonne journée!");
        }
        
        // Si c'est une femme.
        if (sexe == 1){
            
            // Les variables
            double taux = Utilitaires.lireReel("Entrez le degré d'alcool en pourcentage: ");
            double masse = Utilitaires.lireReel("Entrez votre masse en kg: ");
            double reponse = (volume*taux*0.8)/(6*masse);
            double arrondissement = Math.round(reponse*1000.0)/1000.0;
            
             // Les choix
            System.out.println("Votre taux d'alcool est de " + arrondissement);
            System.out.println("\nSélectionner l'un cas suivanrs: "
                    + "\n<0> Vous avez moins de 22 ans."
                    + "\n<1> Vous êtes un apprenti conducteur."
                    + "\n<2> Vous avez un permis probatoire."
                    + "\n<3> Aucun de ces choix");
            float c = Utilitaires.lireEntier("\nEnrez votre choix: ");
            
            // Les conditions
             if (c == 0) {
                System.out.println("\nConducteur moins de 22 ans - taux de " + arrondissement +
                        "\n- Suspension immédiate du permis de 90 jours."
                                + "\n- Perte de 4 points d'inaptitude."
                        + "\n- Amende entre 300$ à 600$");
            } else if (c == 1){
                System.out.println("\nApprenti conducteur - taux de " + arrondissement
                        + "\n- Suspension immédiate du permis de 90 jours."
                        + "\n- Perte de 4 points d'inaptitude."
                        + "\n- Amende entre 300$ à 600$");
            } else if (c == 2){
                System.out.println("\nPermis probatoire - taux de " + arrondissement
                        + "\n- Suspension immédiate du permis de 90 jours."
                        + "\n- Perte de 4 points d'inaptitude."
                        + "\n- Amende entre 300$ à 600$");
            } else if (c == 3){
                if (arrondissement >= 0.8){
                    System.out.println("\nConducteur de 22 ans et plus - Taux égal ou supérieur à 0.08 mg/100ml"
                        + "\n- Suspension immédiate du permis de 24 heures."
                        + "\n- Saisie immédiate du véhicule de 30 jours.");
                }else if (arrondissement < 0.8){
                    System.out.println("\nConducteur de 22 ans et plus"
                      + "\nVotre écart avec le taux de 0.8 mG/100ml est de " + (0.08-arrondissement)
                      + "\nVotre consommation est raisonnable");  
                } 
        }
        
        System.out.println("\n Merci et bonne journée!");
    }
}
}

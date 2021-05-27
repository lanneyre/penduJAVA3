import java.util.Scanner;

public class Interface {
    public Scanner sc;

    Interface(){
        this.sc = new Scanner(System.in);
    }

    /*methode qui dessine le pendu selon le niveau d'erreurs
     * c'est une méthode statique : on peut l'appeller sans passer par les objets
     * 
     */
    public static void affichagePendu(int niv){
    	System.out.println("");
        if(niv == 1){
            System.out.println("=============");
        }else if(niv == 2){
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }else if(niv == 3){
            System.out.println(" ||/         ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 4){
            System.out.println(" ==========Y=");
            System.out.println(" ||/         ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 5){
            System.out.println(" ==========Y=");
            System.out.println(" ||/       | ");
            System.out.println(" ||        0 ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 6){
            System.out.println(" ==========Y=");
            System.out.println(" ||/       | ");
            System.out.println(" ||        0 ");
            System.out.println(" ||       -|-");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 7){
            System.out.println(" ==========Y=");
            System.out.println(" ||/       | ");
            System.out.println(" ||        0 ");
            System.out.println(" ||       -|-");
            System.out.println(" ||       / \\");
            System.out.println("/||          ");
            System.out.println("=============");
            
            System.out.println("Vous avez perdu !");
        }
        System.out.println("");
    }
}

import java.util.Scanner;

public class Interface {
    public Scanner sc;

    Interface(){
        this.sc = new Scanner(System.in);
    }

    public void affichagePendu(int niv){
        if(niv == 0){
            System.out.println("=============");
        }else if(niv == 1){
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }else if(niv == 2){
            System.out.println(" ||/         ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 3){
            System.out.println(" ==========Y=");
            System.out.println(" ||/         ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 4){
            System.out.println(" ==========Y=");
            System.out.println(" ||/       | ");
            System.out.println(" ||        0 ");
            System.out.println(" ||          ");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 5){
            System.out.println(" ==========Y=");
            System.out.println(" ||/       | ");
            System.out.println(" ||        0 ");
            System.out.println(" ||       /|\\");
            System.out.println(" ||          ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
        else if(niv == 6){
            System.out.println(" ==========Y=");
            System.out.println(" ||/       | ");
            System.out.println(" ||        0 ");
            System.out.println(" ||       /|\\");
            System.out.println(" ||       /| ");
            System.out.println("/||          ");
            System.out.println("=============");
        }
    }
}

import java.util.ArrayList;

public class Utilisateur {
    public int nbChances;
    public ArrayList<Character> historique;

    Utilisateur(){
        this.nbChances = 7;
        this.historique = new ArrayList<Character>();
        //ajouter à la liste de caractères l'espace vide permet de jouer des mots en plusieurs parties
        this.historique.add(' ');
    }

    public char faireProposition(){
        Interface i = new Interface();
        System.out.println("Faire une proposition : ");
        return i.sc.nextLine().charAt(0);
    }
}

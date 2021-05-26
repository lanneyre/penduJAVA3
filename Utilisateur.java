import java.util.ArrayList;

public class Utilisateur {
    public int nbChances;
    public ArrayList<Character> historique;

    Utilisateur(){
        this.nbChances = 6;
        this.historique = new ArrayList<Character>();
    }

    public char faireProposition(){
        Interface i = new Interface();
        System.out.println("Faire une proposition : ");
        return i.sc.nextLine().charAt(0);
    }
}

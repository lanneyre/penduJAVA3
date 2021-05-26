import java.util.ArrayList;

public class Pendu {
    public static void main(String[] args) throws Exception {
        Mot m = new Mot();
        m.motRandom();
        System.out.println(m.motATrouver);
        //m.displayMot(new ArrayList<Character>());

        Utilisateur u = new Utilisateur();
        while(u.nbChances > 0){
            m.displayMot(u.historique);
            char p = u.faireProposition();
            u.historique.add(p);
            if(!m.checkLettre(p)){
                u.nbChances--;  
            }
        }
         
    }
}

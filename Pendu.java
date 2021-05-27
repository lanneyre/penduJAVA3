import java.util.ArrayList;

public class Pendu {
    public static void main(String[] args) throws Exception {
        Mot m = new Mot();
        m.motRandom();
        System.out.println(m.motATrouver);
        //m.displayMot(new ArrayList<Character>());

        Utilisateur u = new Utilisateur();
        m.displayMot(u.historique);
        //on arrête la partie si le nombre de chances est epuisé ou si on a trouvé le mot entier
        do{
            
            
            char p = u.faireProposition();
            //pour ne pas avoir besoin de vérifier à l'affichage si des lettres sont minuscules ou majuscules
            u.historique.add(Character.toUpperCase(p));
            u.historique.add(Character.toLowerCase(p));
            
            if(!m.checkMotATrouver(p)){
                u.nbChances--;  
            }
            Interface.affichagePendu(7 - u.nbChances);
            m.displayMot(u.historique);
        }while(u.nbChances > 0 && !checkVictoire(m));
         
    }
    
    //méthode vérifiant si la partie est gagnée ou pas
    public static boolean checkVictoire(Mot m) {
    	if(!m.checkMotADisplay('_')) {
    		System.out.println("Bravo ! Vous avez gagné !");
    		return true;
    	}else {
    		return false;
    	}
    	
    }
}

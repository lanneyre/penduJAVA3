import java.util.ArrayList;

public class Mot {
    public ArrayList<String> listeMots;
    public String motATrouver;

    Mot(){
        this.listeMots = new ArrayList<String>();
        this.listeMots.add("Blanc");
        this.listeMots.add("Podium");
        this.listeMots.add("Attirer");
        this.listeMots.add("Cablage");
        this.listeMots.add("Capitaine");
        this.listeMots.add("Nuage");
        this.listeMots.add("Ovni");
        this.listeMots.add("Humide");
        this.listeMots.add("Femmes");
        this.listeMots.add("Tremble");
        this.listeMots.add("Canal");
        this.listeMots.add("Menottes");
        this.listeMots.add("Artificiel");
        this.listeMots.add("Madone");
        this.listeMots.add("Bazooka");
        this.listeMots.add("Pression");
        this.listeMots.add("Multiplication");
        this.listeMots.add("Prix");
        this.listeMots.add("Plastique");
        this.listeMots.add("Religieuse");
        this.listeMots.add("Cible");
        this.listeMots.add("Soulevement");
        this.listeMots.add("Mediatrice");
        this.listeMots.add("Philosophe");
        this.listeMots.add("Bande");
        this.listeMots.add("Canada");
        this.listeMots.add("Ballon");
        this.listeMots.add("Volee");
        this.listeMots.add("Muet");
        this.listeMots.add("Parking");
        this.listeMots.add("Minuit");
        this.listeMots.add("Hiberner");
        this.listeMots.add("Loin");
        this.listeMots.add("Rabat");
        this.listeMots.add("Monarchie");
        this.listeMots.add("Vache");
        this.listeMots.add("Rapide");
        this.listeMots.add("Entrepot");
        this.listeMots.add("Feuille");
        this.listeMots.add("Taxi");
        this.listeMots.add("Bronze");
        this.listeMots.add("Hydrogene");
        this.listeMots.add("Nouveaute");
        this.listeMots.add("Route");
        this.listeMots.add("Recipient");
        this.listeMots.add("Fossette");
        this.listeMots.add("Demander");
        this.listeMots.add("Terrain");
        this.listeMots.add("Aviateur");
        this.listeMots.add("Boussole");
        this.listeMots.add("Plomb");
        this.listeMots.add("Catapulte");
        this.listeMots.add("Recueillir");
        this.listeMots.add("Stimulateur");
        this.listeMots.add("Cardiaque");
        this.listeMots.add("Chant");
        this.listeMots.add("Brun");
        this.listeMots.add("Gribouiller");
        this.listeMots.add("Locomotive");
        this.listeMots.add("Chenil");
    }

    public void motRandom(){
        this.motATrouver = listeMots.get((int) (Math.random()*listeMots.size()));
    }

    /*public void displayMot(String selectedWord, ArrayList<Character> chosenLetters){
        int i = 0;
		char[] wordTab = new char[selectedWord.length()];
		while(i<selectedWord.length()) {
			if(chosenLetters.contains(selectedWord.charAt(i))) {
				System.out.print(selectedWord.charAt(i)+" ");
				wordTab[i]=selectedWord.charAt(i);
			}
			else 
				{
				System.out.print("_ ");
				wordTab[i]= '_';
				}
			i++;
		}
		// String charFound = new String (wordTab);
		// return charFound;
    }*/
    public void displayMot(ArrayList<Character> chosenLetters){
        //char[] wordTab = new char[this.motATrouver.length()];
        for(int i = 0; i < this.motATrouver.length(); i++){
            //System.out.print(this.motATrouver.charAt(i));
            if(chosenLetters.contains(this.motATrouver.charAt(i))){
                System.out.print(this.motATrouver.charAt(i));
            } else {
                System.out.print("_");
            }
            System.out.print(" ");
        }
        System.out.println("");
    }

    public boolean checkLettre(char lettre){
        char[] wordTab = new char[this.motATrouver.length()];
        for(int i = 0; i < wordTab.length; i++){
            if(wordTab[i] == lettre ){
                return true;
            }
        }
        return false;
    }


}

package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TraducteurUtils {

    public static String ajouterEntreConsonneVoyelle(String sentence, String motAjout) {
    	
        String regex = "([bcdfghjklmnpqrstvwxyz])([aeiou])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        return matcher.replaceAll("$1" + motAjout + "$2");
    }

    public static String ajouterADebutMotVoyelle(String sentence, String motAjout) {
    	
        String regex = "(\\b)([AEIOUaeiou])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        return matcher.replaceAll("$1" + motAjout + "$2");
    }
	    
	    
    public static String supprimerADebutMotVoyelle(String sentence, String motSupprime) {
    	
        String regex = "(\\b)" + motSupprime + "([AEIOUaeiou])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        return matcher.replaceAll("$1$2");
    }
    
    public static String supprimerEntreConsonneVoyelle(String sentence, String motSupprime) {
    	
        String regex = "([bcdfghjklmnpqrstvwxyz])" + motSupprime + "([aeiou])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);

        return matcher.replaceAll("$1$2");
    }
	
}

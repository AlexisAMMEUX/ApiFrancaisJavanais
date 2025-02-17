package Utils;

public class TraducteurUtil {
	
	private final static String SYLLABE_JAVANAISE = "av";
	
	private TraducteurUtil() {}
    
    public static String traduireEnJavanais(String phrase) {
        String[] words = phrase.split("\\b");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(motVersJavanais(word));
        }

        return result.toString().trim();
    }

    private static String motVersJavanais(String word) {
        // Regex 1 : pour ajouter "av" entre une consonne suivie d'une voyelle
        word = word.replaceAll("(?i)([^aeiouy])([aeiouy])", "$1" + SYLLABE_JAVANAISE + "$2");
        
        // Regex 2 : pour ajouter "av" devant la première voyelle si le mot commence par une voyelle
        // Doit être fait après la regex 1
        word = word.replaceAll("^(?i)([aeiouy])", SYLLABE_JAVANAISE + "$1");

        return word;
    }
    
    public static String traduireEnFrancais(String phrase) {
        String[] words = phrase.split("\\b");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(motVersFrancais(word));
        }

        return result.toString().trim();
    }

    private static String motVersFrancais(String word) {
        // Regex 1 : pour ajouter "av" entre une consonne suivie d'une voyelle
        word = word.replaceAll("(?i)([^aeiouy])" + SYLLABE_JAVANAISE + "([aeiouy])", "$1$2");
        
        // Regex 2 : pour ajouter "av" devant la première voyelle si le mot commence par une voyelle
        word = word.replaceAll("^(?i)" + SYLLABE_JAVANAISE + "([aeiouy])", "$1");

        return word;
    }
    
	
}

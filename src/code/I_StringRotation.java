public class I_StringRotation {
    public static boolean isRotation(String word, String rotation) {
        
        String temp = word + word;
        return isSubstring(temp,rotation);
    }

    private static boolean isSubstring(String word, String substring){
    	return word.contains(substring);
    }
}

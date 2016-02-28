import java.util.Arrays;

public class J_Anagram {

	/**
	* Sort arrays
	*/
    public static boolean methodOne(String word, String anagram) {
        
        char[] wordArray = word.toLowerCase().toCharArray();
        char[] anagramArray = anagram.toLowerCase().toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        return Arrays.equals(wordArray,anagramArray);
    }

	/**
	* Use temp string
	*/
    public static boolean methodTwo(String word, String anagram) {
        if(word.length() != anagram.length() ){
            return false;
        }

        int i = 0;
        while(i < word.length() && word.length() > 0){
        	char ch = word.toLowerCase().charAt(i);
        	int loc = anagram.toLowerCase().indexOf(ch);
        	if(loc == -1){
        		return false;
        	}
            anagram = anagram.substring(0,loc) + anagram.substring(loc+1,anagram.length());
            i++;
        }
        return anagram.length() == 0;
    }


    /**
     * Use same string abd toarray
     */
    public static boolean methodThree(String word, String anagram) {

        for(char ch : word.toCharArray()){
            int loc = anagram.toLowerCase().indexOf(ch);
            if(loc == -1){
                return false;
            }
            anagram = anagram.substring(0,loc) + anagram.substring(loc+1,anagram.length());
        }
        return anagram.length() == 0;
    }
}

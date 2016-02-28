import java.util.Arrays;

/**
 * Cracking the coding interview 1.3 page 73
 * Give 2 strings, decide if one is permutation of the other.
 * Only concered about same characters, not finding words.
 * 2 ways to achieve this.
 */
public class G_IsPermutation {

	/**
	* Use sorting
	*/
    public static boolean methodOne(String word, String perm) {
        if(word.length() != perm.length()){
        	return false;
        }

        char[] wordArray = word.toLowerCase().toCharArray();
        char[] permArray = perm.toLowerCase().toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(permArray);
        
        return Arrays.equals(wordArray,permArray);
    }

	/**
	* Use string
	*/
    public static boolean methodTwo(String word, String perm) {
        if(word.length() != perm.length()){
        	return false;
        }

        for(int i=0; i<word.length();i++){
        	char ch = word.charAt(i);
        	int index = perm.indexOf(ch);
        	if(index == -1){
        		return false;
        	}
        	perm = perm.substring(0,index) + perm.substring(index+1,perm.length());
        } 
        return perm.length() == 0;
    }
}

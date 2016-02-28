import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Cracking the coding interview page 73 exercise 1.1
 */
public class D_UniqueCharacters {

	/**
	* Use boolean array and loop
	*/
	public static boolean methodOne(String input){
        if(input == null || input.equals("")){
        	throw new IllegalArgumentException();
        }

        // Assume Ansi so 128 characters
        boolean[] bool = new boolean[128];
        for(int i=0; i<input.length(); i++){     
        	char ch = input.charAt(i); 
        	if(bool[ch]) {
        		return false;
        	}
        	bool[ch] = true;
        }
        return true;
	}

	/**
	* Use a loop and a set
	*/
    public static boolean methodTwo(String input){
        if(input == null || input.equals("")){
        	throw new IllegalArgumentException();
        }
        Set<Character> set = new HashSet<>();
        for(int i=0; i<input.length() ; i++){
        	char ch = input.charAt(i);
        	if(set.contains(ch)){
        		return false;
        	} else {
        		set.add(ch);
        	}
        }
        return true;
    }

    /**
    * Loop in a loop
    */
	public static boolean methodThree(String input) {
        if(input == null || input.equals("")){
        	throw new IllegalArgumentException();
        }
        for(int i=0;i<input.length()-1;i++){
        	for(int j=i+1;j<input.length();j++)
        		if(input.charAt(i) == input.charAt(j)){
        			return false;
        		}
        }
        return true;
	}

	/**
	* Stream
	*/
	public static boolean methodFour(String input) {
        if(input == null || input.equals("")){
        	throw new IllegalArgumentException();
        }
        return Stream.of(input)
        	.flatMapToInt(CharSequence::chars)
        	.distinct()
        	.count() == input.length();
	}
}

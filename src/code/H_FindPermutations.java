import java.util.ArrayList;
import java.util.List;

/**
 * Not fom book, from internet.
 */
public class H_FindPermutations {

    public static List<String> findPermutations(String input){
        List<String> perms = new ArrayList<>();

        findPerms(perms,"",input);
        return perms;
    }

    private static void findPerms(List<String> perms, String prefix, String input){
    	if(input.length() == 0){
    		perms.add(prefix);
    		return;
    	}
    	for(int i=0; i<input.length(); i++){
    		char fixedChar = input.charAt(i);
    		String remaining = input.substring(0,i) + input.substring(i+1,input.length());
    		findPerms(perms, prefix + fixedChar, remaining);
    	}
    }
}

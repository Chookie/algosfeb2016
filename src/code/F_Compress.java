/**
 * Cracking the coding interview 1.5 page 176
 * Implement basic compression by replacing repeated characters with count.
 * If compressed is not smaller than original than return original.
 * 3 solutions.  Using string concact, string buff and when cannot use buffer.
 */
public class F_Compress {

    /**
     * Using String concat
     */
     public static String compressOne(String input) {
        int compressedSize = compressedSize(input);
        if(compressedSize >= input.length()){
            return input;
        }

     	String compressed = "";  
     	int charCount = 1;   	
     	for(int i=1; i<input.length(); i++){
     		if(input.charAt(i) == (input.charAt(i-1))){
     			charCount++;
     		} else {
     			compressed += input.charAt(i-1) + String.valueOf(charCount);
     			charCount = 1; 
     		}
     	}
        compressed += input.charAt(input.length()-1) + String.valueOf(charCount);
     	return compressed;
     }

    /**
     * Using String presized array
     */
     public static String compressTwo(String input) {
        int compressedSize = compressedSize(input);
        if(compressedSize >= input.length()){
            return input;
        }

     	char[] compressed = new char[compressedSize];  
     	int charCount = 1;   	
     	int arrayPos = 0;
     	for(int i=1; i<input.length(); i++){
     		if(input.charAt(i) == (input.charAt(i-1))){
     			charCount++;
     		} else {
     			compressed[arrayPos++] = input.charAt(i-1);
                char[] chars = String.valueOf(charCount).toCharArray();
                for(char ch : chars){
                	compressed[arrayPos++] = ch;
                }
     			charCount = 1; 
     		}
     	}
         compressed[arrayPos++] = input.charAt(input.length()-1);
         char[] chars = String.valueOf(charCount).toCharArray();
         for(char ch : chars){
             compressed[arrayPos++] = ch;
         }
     	return String.valueOf(compressed);
     }

     private static int compressedSize(String input){
     	if(input.length() <= 1){
     		return input.length();
     	}
     	int length = 0;
     	for(int i=1; i<input.length(); i++){
     		if(input.charAt(i) != (input.charAt(i-1))){
     			length += 2;
     		}
     	}
         // plus last one
         return length + 2;
     }
}

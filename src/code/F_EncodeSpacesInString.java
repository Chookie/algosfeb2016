/**
 * Cracking the coding interview question 1.4 page 73
 * Write methos to replace all spaces with %20
 * Assume the length you are given is the true length so can hold additional characters.
 * In java use character array so can do in-place.
 */
public class F_EncodeSpacesInString {
    public static char[] encode(char[] input, int length) {
        if(input.length ==0 || length == 0){
            return input;
        }

        int spaces = 0;
        for(int i=0;i<length;i++){
        	if(input[i]==' '){
                spaces++;
        	}
        }
        if(spaces == 0){
            return input;
        }
        int newEnd = (length -1) + spaces * 2;
        int i = length-1;
        while(i>=0 && spaces > 0){
            if(input[i] != ' '){
                input[newEnd] = input[i];
                newEnd--;
            } else {
                input[newEnd] = '0';
                input[newEnd-1] = '2';
                input[newEnd-2] = '%';
                newEnd -= 3;
                spaces--;
            }
            i--;
        }

        return input;
    }
}

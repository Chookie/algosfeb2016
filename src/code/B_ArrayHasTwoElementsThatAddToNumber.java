import java.util.Arrays;

public class B_ArrayHasTwoElementsThatAddToNumber {
    public static boolean check(int[] numbers, int toFind){   
    	if(numbers.length == 0) {
    		return false;
    	}     
        Arrays.sort(numbers);
        int low = 0;
        int high = numbers.length-1;
        while(low < high){
        	int sum = numbers[low] + numbers[high];
	        if(sum == toFind){
	        	return true;
	        } else if (sum < toFind) {
	        	low++;
	        } else {
	        	high--;
	        }
        }
        return numbers[low] == toFind;
    }
}

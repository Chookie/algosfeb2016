
/**
 * Elements of programming interviews in Java page 43
 */
public class M_Parity {
    public static int getParity(int input) {
    	byte parity = 0;
    	while(input > 0){
    		parity ^= 1;
            // See
            input &= (input-1);
    	}
        return parity;
    }
}

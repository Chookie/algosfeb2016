import java.util.HashSet;
import java.util.Set;

public class A_FB_ArrayContainsTotal {

    /**
     * This only works for positive targets
     */
    public static boolean arrayContains(int[] array, int target) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int item : array) {
            sum += item;
            if (sum == target) {
                return true;
            } else if (sum < target) {
                set.add(sum);
            } else {
                int diff = sum - target;
                if (set.contains(diff)) {
                    return true;
                }
            }
        }
        return false;
    }
}

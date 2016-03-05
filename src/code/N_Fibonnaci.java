import java.time.Duration;
import java.time.Instant;

/**
 * Cracking code page 108, Elements of interviews in java page 308
 */
public class N_Fibonnaci {
    public static long useRecursion(int target) {
        Instant start = Instant.now();

        long result = useRecursion2(target);

        Instant end = Instant.now();
        System.out.printf("useRecursion(%d) took %d ms%n",target, Duration.between(start,end).toMillis());

        return result;
    }

    private static long useRecursion2(int target) {
        if(target < 2) {
            return target;
        }
        return useRecursion2(target-1) + useRecursion2(target-2);
    }

    private static final long[] cache = new long[50];

    public static long useRecursionWithCache(int target) {
        Instant start = Instant.now();

        long result = useRecursionWithCache2(target);

        Instant end = Instant.now();
        System.out.printf("useRecursionWithCache(%d) took %d ns%n",target, Duration.between(start,end).toMillis());

        return result;
    }

    private static long useRecursionWithCache2(int target) {
        if(target < 2) {
            return target;
        }
        if(cache[target] != 0){
            return cache[target];
        }
        cache[target] = useRecursionWithCache2(target-1) + useRecursionWithCache2(target-2);
        return cache[target];
    }

    public static long useIterator(int target) {
        Instant start = Instant.now();

        long result = useIterator2(target);

        Instant end = Instant.now();
        System.out.printf("useIterator(%d) took %d ns%n",target, Duration.between(start,end).toMillis());

        return result;
    }

    private static long useIterator2(int target) {
        if(target < 2) {
            return target;
        }

        int prev=1; int prevprev = 0;
        for(int i=2; i<=target; ++i){
            int current = prev + prevprev;
            prevprev = prev;
            prev = current;
        }
        return prev;
    }
}

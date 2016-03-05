import spock.lang.Specification
import spock.lang.Unroll


/**
 * Cracking code page 108, Elements of interviews in java page 308
 */
class N_FibonnaciSpec extends Specification {

    @Unroll
    def'use recursion for fabinnoci where target = #target'(){

        expect:
        N_Fibonnaci.useRecursion(target) == fibonnaci

        where:
        target  ||  fibonnaci
        0       ||  0
        1       ||  1
        7       ||  13
        20      ||  6765
        45      ||  1134903170
    }

    @Unroll
    def'use recursion with cache for fabinnoci where target = #target'(){

        expect:
        N_Fibonnaci.useRecursionWithCache(target) == fibonnaci

        where:
        target  ||  fibonnaci
        0       ||  0
        1       ||  1
        7       ||  13
        20      ||  6765
        45      ||  1134903170
    }

    @Unroll
    def'use iteration for fabinnoci where target = #target'(){

        expect:
        N_Fibonnaci.useIterator(target) == fibonnaci

        where:
        target  ||  fibonnaci
        0       ||  0
        1       ||  1
        7       ||  13
        20      ||  6765
        45      ||  1134903170
    }
}
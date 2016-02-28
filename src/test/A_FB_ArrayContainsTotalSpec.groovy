import spock.lang.Specification
import spock.lang.Unroll

@SuppressWarnings("GroovyPointlessBoolean")
public class A_FB_ArrayContainsTotalSpec extends Specification {

    @Unroll
    def '#array #description #target so should return result'(){

        expect:
        A_FB_ArrayContainsTotal.arrayContains(array as int[], target) == result

        where:
        array           | target        | description               || result
        [3,1,6,10]      | 10            | 'contains total at left'  || true
        [3,1,6,10]      | 16            | 'contains total at right' || true
        [3,1,6,10]      | 8             | 'does not contain total'  || false
        [3,1,6,10]      | 10            | 'does not contain total'  || false
        []              | 8             | 'empty'                   || false
        [3,1,6,10]      | 0             | 'target zero'             || false
    }
}

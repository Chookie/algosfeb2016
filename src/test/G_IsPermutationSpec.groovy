import spock.lang.Specification
import spock.lang.Unroll


/**
 * Cracking the coding interview 1.3 page 73
 * Give 2 strings, decide if one is permutation of the other.
 * Only concered about same characters, not finding words.
 * 2 ways to achieve this.
 */
@SuppressWarnings("GroovyPointlessBoolean")
class G_IsPermutationSpec extends Specification {

    @Unroll
    def'methodOne #word and #perm #testcase returns #result'(){

        expect:
        G_IsPermutation.methodOne(word,perm) == result

        where:
        testcase     | word    |  perm     || result
        'is perm'    | 'ABCDE' |  'EBCAD'  || true
        'not perm '  | 'ABCDE' |  'EBC'    || false
    }

    @Unroll
    def'methodTwo #word and #perm #testcase returns #result'(){

        expect:
        G_IsPermutation.methodTwo(word,perm) == result

        where:
        testcase     | word    |  perm     || result
        'is perm'    | 'ABCDE' |  'EBCAD'  || true
        'not perm '  | 'ABCDE' |  'EBC'    || false
    }
}
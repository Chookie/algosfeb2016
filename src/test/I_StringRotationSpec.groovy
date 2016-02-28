import spock.lang.Specification
import spock.lang.Unroll


/**
 * Cracking the coding interview 1.8
 * Assume you have a method isSubstring which returns true if
 * string is substring of another. Check if S2 is rotation of S1
 * using only 1 call to substring.
 * Does not have to be real word.
 */
@SuppressWarnings("GroovyPointlessBoolean")
class I_StringRotationSpec extends Specification {

    @Unroll
    def'#rotation rotation of #word returns #result'(){

        expect:
        I_StringRotation.isRotation(word,rotation) == result

        where:
        word            |  rotation         || result
        'waterbottle'   |  'erbottlewat'    || true
        'god'           |  'odg'            || true
        'waterbottle'   |  'bottlewaterly'  || false
    }
}
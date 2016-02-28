import spock.lang.Specification
import spock.lang.Unroll

/**
 * Cracking the coding interview page 73 exercise 1.1
 * There are 4 ways to do this.
 */
@SuppressWarnings("GroovyPointlessBoolean")
class D_UniqueCharactersSpec extends Specification  {

    @Unroll
    def'methodOne #testcase returns #result'(){
        given:
        def input = 'stutUa'

        expect:
        D_UniqueCharacters.methodone(input) == result

        where:
        input       | testcase                  ||  result
        'sTutUa'    | 'duplicate characters'    ||  false
        'saivw'     | 'unique characters'       ||  true
        'abcdee'    | 'duplicate at end'        ||  false
        'aabcde'    | 'duplicate at start'      ||  false
    }

    @Unroll
    def'methodOne on #testcase ThrowsException' (){
        given:
        def input = null

        when:
        D_UniqueCharacters.methodone(input)

        then:
        thrown(IllegalArgumentException .class)

        where:
        input       | testcase
        ''          | 'empty string'
        null        | 'unique characters'
    }
}
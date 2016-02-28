import spock.lang.Specification

/**
 * Return the reverse of the given string
 * Cracking the code interview question 1.2
 */
class C_StringReverseSpec extends Specification {

    def'reverses string ok'(){
        given:
        String forward = 'abcdef'
        String reverse = 'fedcba'

        expect:
        C_StringReverse.get(forward) == reverse
    }

    def'empty string returns empty string'(){
        given:
        String forward = ''
        String reverse = ''

        expect:
        C_StringReverse.get(forward) == reverse
    }

    def'null string returns empty null'(){
        given:
        String forward = null
        String reverse = null

        expect:
        C_StringReverse.get(forward) == reverse
    }

    def'single character string returns character'(){
        given:
        String forward = 'f'
        String reverse = 'f'

        expect:
        C_StringReverse.get(forward) == reverse
    }

    def'mixed case returns reversed string'(){
        given:
        String forward = 'AbDgT'
        String reverse = 'TgDbA'

        expect:
        C_StringReverse.get(forward) == reverse
    }
}
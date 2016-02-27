import spock.lang.Specification

class A_UnbalancedBracesSpec extends Specification{

    def'Too many left'(){
        given:
        String input = 'a((abc)((def)e'
        String result = 'a(abc)(def)e'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }

    def'First character is unbalanced brace'(){
        given:
        String input = '((abc)((def)f'
        String result = '(abc)(def)f'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }

    def'Last character is unbalanced brace'(){
        given:
        String input = 'f((abc)((def)'
        String result = 'f(abc)(def)'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }

    def'First and last characters are unbalanced brace'(){
        given:
        String input = ')(abc)(def)('
        String result = '(abc)(def)'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }

    def'First and last characters are balanced braces'(){
        given:
        String input = '((abc)f(def))'
        String result = '((abc)f(def))'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }

    def'Empty string'(){
        given:
        String input = '((abc)f(def))'
        String result = '((abc)f(def))'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }

    def'Null string'(){
        given:
        String input = '((abc)f(def))'
        String result = '((abc)f(def))'

        expect:
        A_UnbalancedBraces.balance(input) == result
    }
}

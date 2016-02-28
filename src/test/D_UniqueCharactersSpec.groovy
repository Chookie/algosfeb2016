import spock.lang.Specification
import spock.lang.Unroll

/**
 * Cracking the coding interview page 73 exercise 1.1
 * There are 4 ways to do this.
 */
@SuppressWarnings("GroovyPointlessBoolean")
class D_UniqueCharactersSpec extends Specification  {

    // One
    @Unroll
    def'methodOne #testcase #input returns #result'(){
        expect:
        D_UniqueCharacters.methodOne(input) == result

        where:
        input       | testcase                  ||  result
        'sTutua'    | 'duplicate characters'    ||  false
        'sTutUa'    | 'different case'          ||  true
        'saivw'     | 'unique characters'       ||  true
        'abcdee'    | 'duplicate at end'        ||  false
        'aabcde'    | 'duplicate at start'      ||  false
    }

    @Unroll
    def'methodOne on #testcase ThrowsException' (){
        when:
        D_UniqueCharacters.methodOne(input)

        then:
        thrown(IllegalArgumentException .class)

        where:
        input       | testcase
        ''          | 'empty string'
        null        | 'unique characters'
    }
    
    

    // Two
    @Unroll
    def'methodTwo #testcase #input returns #result'(){
        expect:
        D_UniqueCharacters.methodTwo(input) == result

        where:
        input       | testcase                  ||  result
        'sTutua'    | 'duplicate characters'    ||  false
        'sTutUa'    | 'different case'          ||  true
        'saivw'     | 'unique characters'       ||  true
        'abcdee'    | 'duplicate at end'        ||  false
        'aabcde'    | 'duplicate at start'      ||  false
    }

    @Unroll
    def'methodTwo on #testcase ThrowsException' (){
        when:
        D_UniqueCharacters.methodTwo(input)

        then:
        thrown(IllegalArgumentException .class)

        where:
        input       | testcase
        ''          | 'empty string'
        null        | 'unique characters'
    }



    // Three
    @Unroll
    def'methodThree #testcase #input returns #result'(){
        expect:
        D_UniqueCharacters.methodThree(input) == result

        where:
        input       | testcase                  ||  result
        'sTutua'    | 'duplicate characters'    ||  false
        'sTutUa'    | 'different case'          ||  true
        'saivw'     | 'unique characters'       ||  true
        'abcdee'    | 'duplicate at end'        ||  false
        'aabcde'    | 'duplicate at start'      ||  false
    }

    @Unroll
    def'methodThree on #testcase ThrowsException' (){
        when:
        D_UniqueCharacters.methodThree(input)

        then:
        thrown(IllegalArgumentException .class)

        where:
        input       | testcase
        ''          | 'empty string'
        null        | 'unique characters'
    }



    // Four
    @Unroll
    def'methodFour #testcase #input returns #result'(){
        expect:
        D_UniqueCharacters.methodFour(input) == result

        where:
        input       | testcase                  ||  result
        'sTutua'    | 'duplicate characters'    ||  false
        'sTutUa'    | 'different case'          ||  true
        'saivw'     | 'unique characters'       ||  true
        'abcdee'    | 'duplicate at end'        ||  false
        'aabcde'    | 'duplicate at start'      ||  false
    }

    @Unroll
    def'methodFour on #testcase ThrowsException' (){
        when:
        D_UniqueCharacters.methodFour(input)

        then:
        thrown(IllegalArgumentException .class)

        where:
        input       | testcase
        ''          | 'empty string'
        null        | 'unique characters'
    }
}
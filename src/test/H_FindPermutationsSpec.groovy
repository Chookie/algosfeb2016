import spock.lang.Specification

/**
 * Not fom book, from internet.
 */
class H_FindPermutationsSpec extends Specification {

    def'find all permutations is successful'(){
        given:
        def input = 'cba'
        def permutations = ['cba', 'bca', 'bac','cab','acb','abc']

        expect:
        H_FindPermutations.findPermutations(input).sort() == permutations.sort()
    }
}
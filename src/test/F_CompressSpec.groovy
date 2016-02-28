import spock.lang.Specification
import spock.lang.Unroll


/**
 * Cracking the coding interview 1.5 page 176
 * Implement basic compression by replacing repeated characters with count.
 * If compressed is not smaller than original than return original.
 * 3 solutions.  Using string concact, string buff and when cannot use buffer.
 */
class F_CompressSpec extends Specification {

    @Unroll
    def 'compressOne #input #testcase returns #result'() {

        expect:
        F_Compress.compressOne(input) == result;

        where:
        input           | testcase                  ||  result
        'aabcccccaaa'   | 'converted is smaller'    ||  'a2b1c5a3'
        'aabbccddee'    | 'converted is same'       ||  'aabbccddee'
        'abcdef'        | 'no repeats'              ||  'abcdef'
    }

    @Unroll
    def 'compressTwo #input #testcase returns #result'() {

        expect:
        F_Compress.compressTwo(input) == result;

        where:
        input           | testcase                  ||  result
        'aabcccccaaa'   | 'converted is smaller'    ||  'a2b1c5a3'
        'aabbccddee'    | 'converted is same'       ||  'aabbccddee'
        'abcdef'        | 'no repeats'              ||  'abcdef'
    }
}
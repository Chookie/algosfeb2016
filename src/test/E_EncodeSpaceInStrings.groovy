import spock.lang.Specification


/**
 * Cracking the coding interview question 1.4 page 73
 * Write methos to replace all spaces with %20
 * Assume the length you are given gives location of last character before spaces.
 * In java use character array so can do in-place.
 */
class E_EncodeSpaceInStrings extends Specification {
    def'testEncodeSpaces'(){
        given:
        char[] unencoded = "Mr John Smith    ".toCharArray();
        int length = 13;
        char[] encoded = "Mr%20John%20Smith".toCharArray();

        when:
        char[] result = E_EncodeSpacesInString.encode(unencoded,length);

        then:
        result == encoded;
    }
}
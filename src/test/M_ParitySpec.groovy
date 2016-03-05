import spock.lang.Specification


/**
 * Elements of programming interviews in Java page 43
 */
class M_ParitySpec extends Specification {

    def'find parity for odd parity'(){
        given:
        byte number = 0b010101

        expect:
        M_Parity.getParity(number) == 1
    }

    def'find parity for even parity'(){
        given:
        byte number = 0b01010101

        expect:
        M_Parity.getParity(number) == 0
    }
}
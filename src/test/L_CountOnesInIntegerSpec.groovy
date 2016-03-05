import spock.lang.Specification


class L_CountOnesInIntegerSpec extends Specification {

    def'ones at start middle and end returns 3'(){
        given:
        int number = 0b1001001


        expect:L_CountOnesInInteger.count(number) == 3
    }

    def'ones middle only returns 1'(){
        given:
        int number = 0b0001000

        expect:
        L_CountOnesInInteger.count(number) == 1
    }

    def'all ones returns 7'(){
        given:
        int number = 0b1111111


        expect:L_CountOnesInInteger.count(number) == 7
    }

    def'no ones returns 0'(){
        given:
        int number = 0b0000000

        expect:
        L_CountOnesInInteger.count(number) == 0
    }
}
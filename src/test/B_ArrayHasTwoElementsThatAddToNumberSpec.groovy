import spock.lang.Specification

// Idea is to see if there are 2 numbers in array that sum to the sum
@SuppressWarnings("GroovyPointlessBoolean")
class B_ArrayHasTwoElementsThatAddToNumberSpec extends Specification {

    def'empty array returns false'(){
        given:
        int[] array = []
        int sum = 8

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == false
    }

    def'zero sum returns false'(){
        given:
        int[] array = [10,5,7,3,2,6,4]
        int sum = 0

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == false
    }

    def'single int array found returns true'(){
        given:
        int[] array = [8]
        int sum = 8

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }

    def'less than array not found returns false'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 2

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == false
    }

    def'more than array not found returns false'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 20

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == false
    }

    def'within array not found returns false'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 5

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == false
    }

    def'sum edge unsorted returns true'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 14

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }

    def'sum edge sorted returns true'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 13

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }

    def'sum centre sorted returns true'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 10
        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }

    def'sum edge  and inner sorted returns true'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 17

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }

    def'sum inner sorted returns true'(){
        given:
        int[] array = [10,5,7,3,6,4]
        int sum = 8

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }

    def'negative sum found returns true'(){
        int[] array = [-1,-3,-4,-2]
        int sum = -3

        expect:
        B_ArrayHasTwoElementsThatAddToNumber.check(array,sum) == true
    }
}
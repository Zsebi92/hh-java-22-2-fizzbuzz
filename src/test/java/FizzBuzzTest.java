import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzzTestFor3() {

        //Given
        int number = 3;

        //When
        String actual = FizzBuzz.fizzBuzz(number);

        //Then
        assertEquals("fizz", actual);
    }

    @Test
    void fizzBuzzTestFor5() {

        //Given
        int number = 5;

        //When
        String actual = FizzBuzz.fizzBuzz(number);

        //Then
        assertEquals("buzz", actual);
    }

    @Test
    void fizzBuzzTestFor15() {

        //Given
        int number = 15;

        //When
        String actual = FizzBuzz.fizzBuzz(number);

        //Then
        assertEquals("fizzbuzz", actual);
    }


}

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.*;

//Neste problema, você deverá exibir uma lista de 1 a 100, um em cada linha, com as seguintes exceções:
//        Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
//        Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
//        Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.

public class FizzbuzzTest {

    private Fizzbuzz fizzBuzz = new Fizzbuzz();

    @Test
    public void returnsOneWhenGivenOne(){
        assertThat(fizzBuzz.transform(1), is("1"));
    }

    @Test
    public void returnsTwoWhenGivenTwo(){
        assertThat(fizzBuzz.transform(2), is("2"));
    }

    @Test
    public void returnsFizzWhenGivenThree(){
        assertThat(fizzBuzz.transform(3), is("Fizz"));
    }

    @Test
    public void returnsBuzzWhenGivenFive() {
        assertThat(fizzBuzz.transform(5), is("Buzz"));
    }

    @Test
    public void returnsFizzWhenGivenSix() {
        assertThat(fizzBuzz.transform(6), is("Fizz"));
    }

    @Test
    public void returnsFizzBuzzWhenGivenFifteen() {
        assertThat(fizzBuzz.transform(15), is("FizzBuzz"));
    }
}

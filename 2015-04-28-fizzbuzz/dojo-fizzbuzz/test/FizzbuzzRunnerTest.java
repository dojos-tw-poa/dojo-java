import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class FizzbuzzRunnerTest {

    @Test
    public void dontCallFizzbuzzGivenZero() {
        Fizzbuzz fizzbuzz = mock(Fizzbuzz.class);
        FizzbuzzRunner fizzbuzzRunner = new FizzbuzzRunner(fizzbuzz);
        fizzbuzzRunner.run(0);
        verify(fizzbuzz, never()).transform(anyInt());
    }

    @Test
    public void callsFizzbuzzOneTime() {
        Fizzbuzz fizzbuzz = mock(Fizzbuzz.class);
        FizzbuzzRunner fizzbuzzRunner = new FizzbuzzRunner(fizzbuzz);
        fizzbuzzRunner.run(1);
        verify(fizzbuzz).transform(1);
    }

    @Test
    public void callsFizzbuzzNTimes() {
        Fizzbuzz fizzbuzz = mock(Fizzbuzz.class);
        FizzbuzzRunner fizzbuzzRunner = new FizzbuzzRunner(fizzbuzz);
        fizzbuzzRunner.run(3);
        verify(fizzbuzz).transform(1);
        verify(fizzbuzz).transform(2);
        verify(fizzbuzz).transform(3);
    }

}

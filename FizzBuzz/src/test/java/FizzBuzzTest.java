import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void evaluateFizzBuzz_fizzNumber(){
        String result = fizzBuzz.evaluateNumber(3);
        assertEquals("Fizz",result);
    }

    @Test
    public void evaluateFizzBuzz_buzzNumber(){
        String result = fizzBuzz.evaluateNumber(5);
        assertEquals("Buzz",result);
    }

    @Test
    public void evaluateFizzBuzz_fizzBuzzNumber(){
        String result = fizzBuzz.evaluateNumber(15);
        assertEquals("FizzBuzz",result);
    }

    @Test
    public void evaluateFizzBuzz_notOfAll(){
        String result = fizzBuzz.evaluateNumber(16);
        assertEquals("16",result);
    }
}

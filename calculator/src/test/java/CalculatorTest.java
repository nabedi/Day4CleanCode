import org.junit.Before;
import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;
    private Double result;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        result = calculator.add(12D,13D);
        assertEquals(Double.valueOf(25),result);
    }

    @Test
    public void subtraction(){
        result = calculator.subtraction(12D,5D);
        assertEquals(Double.valueOf(7),result);
    }

    @Test
    public void divide(){
        result = calculator.divide(12D,5D);
        assertEquals(Double.valueOf(2.4),result);
    }

    @Test
    public void divideByNol(){
        result = calculator.divide(1D,0D);
        Double in = Double.POSITIVE_INFINITY;
        assertEquals(in,result);
    }

    @Test
    public void multiplication(){
        result = calculator.multiplication(12D,5D);
        assertEquals(Double.valueOf(60),result);
    }

    @Test
    public void multiplicationByNol(){
        result = calculator.multiplication(12D,0D);
        assertEquals(Double.valueOf(0),result);
    }

    @Test
    public void modulus(){
        result = calculator.modulus(12D,5D);
        assertEquals(Double.valueOf(2),result);
    }

    @Test
    public void modulusByNol(){
        result = calculator.modulus(12D,0D);
        assertEquals(Double.valueOf(NaN),result);
    }
}

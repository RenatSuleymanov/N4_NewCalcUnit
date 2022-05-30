import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitCalc {
    @Test
    public void divisionTest() throws Exception {
        Calc calc = new Calc();
        String result = calc.result("12 / 4");
        assertEquals("3.0",result);
    }

    @Test
    public void checkingTheMultiplicationOperation() throws Exception {
        Calc calc = new Calc();
        String result = calc.result("12 * 4");
        assertEquals("48.0",result);
    }

    @Test
    public void checkingAdditionOperation() throws Exception {
        Calc calc = new Calc();
        String result = calc.result("12 + 4");
        assertEquals("16.0",result);
    }

    @Test
    public void subtractionCheck() throws Exception {
        Calc calc = new Calc();
        String result = calc.result("12 - 4");
        assertEquals("8.0",result);
    }

    @Test(expected = CalcException.class)
    public void checkingCalcException() throws Exception {
        Calc calc = new Calc();
        String result = calc.result("12 v 20");
    }
}
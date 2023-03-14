package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest extends TestCase {

    @Before
    public void before() {
        CalcService calc = new CalcService();
    }

    @Test
    public void successCount() {
        CalcService calc = new CalcService();
        assertTrue(calc.doMath("1", 5, 7) == 12.0);
        assertTrue(calc.doMath("2", 5, 7) == -2.0);
        assertTrue(calc.doMath("3", 5, 7) == (5.0 / 7.0));
        assertTrue(calc.doMath("4", 5, 7) == (5.0 * 7.0));
    }
    @Test
    public void wrongValues() {
        CalcService calc = new CalcService();
        double p = 0;
        double m = 0;
        assertTrue(calc.doMath("1", p, m) == 12.0);
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void Delimnull() {
        CalcService calc = new CalcService();
        assertTrue(calc.doMath("3", 5, 0) == (5.0 / 0.0));
    }

}
package homeworktests;

import classes.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void addTest() {
        Assert.assertEquals("Values for addition of positive integers are incorrect!",
                10, calc.add(3, 7));
        Assert.assertEquals("Values for addition of negative integers are incorrect!",
                -4, calc.add(-1, -3));
    }

    @Test
    public void divideTest() {
        Assert.assertEquals("Values for division are incorrect!", 2, calc.divide(4, 2));
    }

    @Test
    public void multiplyTest() {
        Assert.assertEquals("Values for multiplication are incorrect!",
                30, calc.multiply(5, 6));
    }

    @Test
    public void subtractTest() {
        Assert.assertEquals("Values for subtraction of positive integers are incorrect!",
                0, calc.subtract(1, 1));
        Assert.assertEquals("Values for subtraction of negative integers are incorrect!",
                8, calc.subtract(-1, -9));
    }
 }

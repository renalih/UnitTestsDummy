package homeworktests;

import classes.EvenOddChecker;
import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {

    EvenOddChecker checker = new EvenOddChecker();

    @Test
    public void evenNumberChecker() {
        Assert.assertTrue("Entered value as even number is incorrect!", checker.check(4));
    }

    @Test
    public void oddNumberChecker() {
        Assert.assertFalse("Entered value as odd number is incorrect!", checker.check(5));
    }
}

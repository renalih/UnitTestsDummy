package homeworktests;

import classes.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(5.3, 2.0);

    @Test
    public void rectangleConstructorTest() {
        Assert.assertEquals(5.3, rectangle.getLength(), 0.0);
        Assert.assertEquals(2.0, rectangle.getWidth(),0.0);
    }

    @Test
    public void rectangleLengthSetterTest() {
        rectangle.setLength(10.0);
        Assert.assertEquals(10.0, rectangle.getLength(), 0.0);
    }

    @Test
    public void rectangleWidthSetterTest() {
        rectangle.setWidth(7.8);
        Assert.assertEquals(7.8, rectangle.getWidth(), 0.0);
    }

    @Test
    public void rectangleAreaTest() {
        Assert.assertEquals(10.6, rectangle.getArea(), 0.0);
    }

}

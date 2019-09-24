package hbcu.stay.ready.com;

import org.junit.Test;
import org.junit.Assert;

public class StringReverserTest {
    @Test
    public void test1() {
        // given
        String input = "Hello";
        String expected = "olleH";

        // when
        String actual = StringReverser.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        String input = "Jello";
        String expected = "olleJ";

        // when
        String actual = StringReverser.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // given
        String input = "Reverse";
        String expected = "esreveR";

        // when
        String actual = StringReverser.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void test4() {
        // given
        String input = "One more time";
        String expected = "emit erom enO";

        // when
        String actual = StringReverser.reverse(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}

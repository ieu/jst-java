package io.github.ieu.jst;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MathUtilsTest {

    @Test
    public void testClampInBound() {
        assertEquals(5, MathUtils.clamp(5, 1, 10));
    }

    @Test
    public void testClampLeftOutBound() {
        assertEquals(1, MathUtils.clamp(-5, 1, 10));
    }

    @Test
    public void testClampLeftLimitPoint() {
        assertEquals(1, MathUtils.clamp(1, 1, 10));
    }

    @Test
    public void testClampRightOutBound() {
        assertEquals(10, MathUtils.clamp(15, 1, 10));
    }

    @Test
    public void testClampRightLimitPoint() {
        assertEquals(10, MathUtils.clamp(10, 1, 10));
    }
}
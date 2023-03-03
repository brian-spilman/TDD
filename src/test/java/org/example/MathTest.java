package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    Math math;

    @Before
    public void setUp() {
        math = new Math();
    }

    @After
    public void cleanUp() {
        System.out.println("Clean Up");
    }

    @Test
    public void testGCF() {
        int gcf = math.GCF(18, 24);
        Assert.assertEquals(6, gcf);
    }

    @Test
    public void testAreaRectangle() {
        int area = math.areaRectangle(10, 20);
        Assert.assertEquals(200, area);
    }

    @Test
    public void testAreaTriangle() {
        double area = math.areaTriangle(10, 20);
        Assert.assertEquals(100, area, 0.01);
    }

    @Test
    public void testAreaCircle() {
        double area = math.areaCircle(10);
        Assert.assertEquals(314.16, area, 0.01);
    }

    @Test
    public void testFactorial() {
        int fact = math.factorial(5);
        Assert.assertEquals(120, fact);
    }

}

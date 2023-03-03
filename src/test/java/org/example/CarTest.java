package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car(10, 5);
    }

    @After
    public void cleanUp() {
        System.out.println("Clean up");
    }

    @Test
    public void testDriveEnoughGas() {
        int miles = car.drive(30);
        Assert.assertEquals(30, miles);
        Assert.assertEquals(2, car.getGas(), 0.01);
    }

    @Test
    public void testDriveNotEnoughGas() {
        int miles = car.drive(60);
        Assert.assertEquals(50, miles);
        Assert.assertEquals(0, car.getGas(), 0.01);
    }

    @Test
    public void testFill() {
        car.fill(5);
        Assert.assertEquals(10, car.getGas(), 0.01);
    }
}

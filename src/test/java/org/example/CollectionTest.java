package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CollectionTest {

    List<Integer> numbersList = new ArrayList<>();
    Set<Integer> numbersSet = new TreeSet<>();
    Queue<String> strings = new PriorityQueue<>();

    @Before
    public void setUp() {
        for(int i = 0; i < 106; i+=5) {
            numbersList.add(i);
            numbersSet.add(i);
        }
        strings.add("red");
        strings.add("green");
        strings.add("blue");
        strings.add("yellow");
        strings.add("purple");
        strings.add("orange");
        strings.add("black");
    }

    @After
    public void cleanUp() {
        System.out.println("Clean Up");
    }

    @Test
    public void testFindMax() {
        int max = Collection.findMax(numbersList);
        Assert.assertEquals(105, max);
    }

    @Test
    public void testFindMin() {
        int min = Collection.findMin(numbersList);
        Assert.assertEquals(0, min);
    }

    @Test
    public void testRemoveLessThan() {
        Collection.removeLessThan(numbersSet, 50);
        Assert.assertEquals(12, numbersSet.size());
    }

    @Test
    public void testRemoveGreaterThan() {
        Collection.removeGreaterThan(numbersSet, 50);
        Assert.assertEquals(11, numbersSet.size());
    }

    @Test
    public void testRemoveHalf() {
        Collection.removeHalf(strings);
        Assert.assertEquals(3, strings.size());
    }

}

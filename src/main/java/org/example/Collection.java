package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.Math.floor;

public class Collection {
    /**
     * Given a list of integers, return the highest integer
     * @param numbers - a list of integers
     * @return the largest integer
     */
    public static int findMax(List<Integer> numbers) {

        int max;

        Iterator<Integer> iterator = numbers.iterator();
        max = iterator.next();

        while(iterator.hasNext()){
            int num = iterator.next();
            if(max < num) { max = num; }
        }

        return max;
    }

    /**
     * Given a list of integers, return the lowest integer
     * @param numbers - a list of integers
     * @return the smallest integer
     */
    public static int findMin(List<Integer> numbers) {
        int min;

        Iterator<Integer> iterator = numbers.iterator();
        min = iterator.next();

        while(iterator.hasNext()){
            int num = iterator.next();
            if(min > num) { min = num; }
        }

        return min;
    }

    /**
     * Given a set of integers, remove all integers which are less than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeLessThan(Set<Integer> numbers, int target) {

        //numbers = numbers.stream().filter(x -> (x >= target)).collect(Collectors.toSet());
        numbers.removeIf(x -> x < target);

    }

    /**
     * Given a set of integers, remove all integers which are greater than target
     * @param numbers - a list of integers
     * @param target - the threshold by which to remove integers
     */
    public static void removeGreaterThan(Set<Integer> numbers, int target) {
        numbers.removeIf(x -> x > target);
    }

    /**
     * Given a queue of strings, remove half of all strings
     * Specifically, the size of the queue after the method is invoked should be equal to
     * floor(N/2) where N is the original size
     * @param strings - the queue of strings to mutuate
     */
    public static void removeHalf(Queue<String> strings) {
        int qSize = (int)(strings.size()/2);
        System.out.println(qSize);
        while(strings.size() > qSize) {
            strings.poll();
        }
    }
}

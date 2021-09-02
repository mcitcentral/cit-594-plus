package HashSetHashMap.HashMap.TwoSum;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Ransom Note | Leetcode #0001 | Easy
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

/**
 * Solution Notes by ______
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // TODO
        return null;
    }

    @Test
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        assertEquals(0, twoSum(nums,target)[0]);
        assertEquals(1, twoSum(nums,target)[1]);
    }
}

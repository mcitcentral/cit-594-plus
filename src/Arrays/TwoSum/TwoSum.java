package Arrays.TwoSum;

import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Two Sum | Leetcode #0001 | Medium
 * https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

/**
 * Solution Notes by _______
 *
 */

public class TwoSum {

    public static int[] twoSum(int nums[], int target) {
        // TODO: Your solution
        return new int[0];
    }

    @Test
    public static void main(String[] args) {

        int[] nums1 = { 2, 7, 11, 15 };
        int[] result1 = twoSum(nums1, 9);
        assertTrue(Arrays.asList(result1).contains(0));
        assertTrue(Arrays.asList(result1).contains(1));

        int[] nums2 = { 3, 2, 4 };
        int[] result2 = twoSum(nums2, 6);
        assertTrue(Arrays.asList(result2).contains(1));
        assertTrue(Arrays.asList(result2).contains(2));

        int[] nums3 = { 3, 3 };
        int[] result3 = twoSum(nums3, 6);
        assertTrue(Arrays.asList(result3).contains(0));
        assertTrue(Arrays.asList(result3).contains(1));

    }
}

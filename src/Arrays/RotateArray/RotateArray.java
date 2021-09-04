package Arrays.RotateArray;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Rotate Array | Leetcode #0189 | Medium
 * https://leetcode.com/problems/rotate-array/
 * 
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 * This is fairly trivial if you use O(n) space. Can you implement it in O(1) space?
 */

/**
 * Solution Notes by _______
 *
 */

public class RotateArray {

    public static void rotate(int nums[], int k) {
        // TODO: Your solution
    }

    @Test
    public static void main(String[] args) {

        int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(nums1, 3);
        int[] expected1 = { 5, 6, 7, 1, 2, 3, 4 };
        assertEquals(expected1, nums1);

        int[] nums2 = { -1, -100, 3, 99 };
        rotate(nums2, 2);
        int[] expected2 = { 3, 99, -1, -100 };
        assertEquals(expected2, nums2);

        int[] nums3 = { 1, 2, 3, 4 };
        rotate(nums3, 4);
        int[] expected3 = { 1, 2, 3, 4 };
        assertEquals(expected3, nums3);

        System.out.println("All tests passed.");

    }
}

package Arrays.BinarySearch;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Binary Search | Leetcode #704 | Easy
 * https://leetcode.com/problems/binary-search/
 * 
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */

/**
 * Solution Notes by _______ 
 *
 */

public class BinarySearch {

    public static int search(int nums[], int target) {
        // TODO: Your solution
        return -1;
    }
 
    @Test
    public static void main(String[] args) {
        int[] nums1 = {-1,0,3,5,9,12};
        assertEquals(4, search(nums1, 9));
    
        int[] nums2 = {-1,0,3,5,9,12};
        assertEquals(-1, search(nums2, 2));
    }
}

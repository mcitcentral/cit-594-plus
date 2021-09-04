package Arrays.SearchInRotatedSortedArray;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Search in Rotated Sorted Array | Leetcode #0033 | Medium
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 
 * There is an integer array nums sorted in ascending order (with distinct values).
* Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
* Given the array nums after the rotation and n integer target, return the index of target if it is in nums, or -1 if it is not in nums.
* You must write an algorithm with O(log n) runtime complexity.
 */

/**
 * Solution Notes by _______
 *
 */

public class SearchInRotatedSortedArray {

  public static int search(int[] nums, int target) {
    // TODO: Your solution
    return -1;
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
    assertEquals(4, search(nums1, 0));
    assertEquals(-1, search(nums1, 3));

    int[] nums2 = { 1 };
    assertEquals(-1, search(nums2, 0));

    System.out.println("All tests passed.");

  }

}

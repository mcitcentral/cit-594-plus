package Arrays.TwoSum.Solutions;

import java.util.Arrays;
import java.util.HashMap;

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

public class Solution0001 {

  public static int[] twoSum(int nums[], int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int val = nums[i];
      int diff = target - val;
      if (map.containsKey(diff)) {
        int[] arr = { map.get(diff), i };
        return arr;
      } else {
        map.put(val, i);
      }
    }
    return new int[0];
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 2, 7, 11, 15 };
    int[] result1 = twoSum(nums1, 9);
    Arrays.sort(result1); // Sort to ensure assert works
    int[] expected1 = { 0, 1 };
    assertArrayEquals(expected1, result1);

    int[] nums2 = { 3, 2, 4 };
    int[] result2 = twoSum(nums2, 6);
    Arrays.sort(result2); // Sort to ensure assert works
    int[] expected2 = { 1, 2 };
    assertArrayEquals(expected2, result2);

    int[] nums3 = { 3, 3 };
    int[] result3 = twoSum(nums3, 6);
    Arrays.sort(result3); // Sort to ensure assert works
    int[] expected3 = { 0, 1 };
    assertArrayEquals(expected3, result3);

  }
}

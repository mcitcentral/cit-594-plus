package Arrays.RotateArray.Solutions;

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
 * Solution Notes by @wilsonplau - Intuitive O(1) space solution was to rotate
 * in a cycle - A bit challenging, key insight being that there's a chance that
 * if length is divisible by k, that simply following the loop until it wraps
 * around to the index will miss other elements. - Therefore, We need to keep
 * count of the number of rotations done, and increment to the next position and
 * run the loop until we rotate the full length of the array.
 */

public class Solution0001 {

  public static void rotate(int nums[], int k) {
    int len = nums.length;
    k = k % len;
    if (len == 0 || k == 0)
      return;

    int i = 0;
    int count = 0;

    while (count < len) {
      int currIndex = i;
      int nextIndex = (i + k) % len;
      int curr = nums[currIndex];

      while (nextIndex != i) {
        int temp = nums[nextIndex];
        nums[nextIndex] = curr;
        count++;
        curr = temp;
        currIndex = nextIndex;
        nextIndex = (currIndex + k) % len;
      }

      nums[nextIndex] = curr;
      count++;
      i++;
    }

  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
    rotate(nums1, 3);
    int[] expected1 = { 5, 6, 7, 1, 2, 3, 4 };
    assertArrayEquals(expected1, nums1);

    int[] nums2 = { -1, -100, 3, 99 };
    rotate(nums2, 2);
    int[] expected2 = { 3, 99, -1, -100 };
    assertArrayEquals(expected2, nums2);

    int[] nums3 = { 1, 2, 3, 4 };
    rotate(nums3, 4);
    int[] expected3 = { 1, 2, 3, 4 };
    assertArrayEquals(expected3, nums3);

    System.out.println("All tests passed.");

  }
}

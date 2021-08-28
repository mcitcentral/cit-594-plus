package Arrays.MissingNumber;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Missing Number | Leetcode #0268 | Easy
 * https://leetcode.com/problems/missing-number/
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */

/**
 * Solution Notes by _______
 *
 */

public class MissingNumber {

  public static int missingNumber(int[] nums) {
    // TODO: Your solution
    return 0;
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 3, 0, 1 };
    assertEquals(2, missingNumber(nums1));

    int[] nums2 = { 0, 1 };
    assertEquals(2, missingNumber(nums2));

    int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    assertEquals(8, missingNumber(nums3));

    int[] nums4 = { 0 };
    assertEquals(1, missingNumber(nums4));

  }

}

package Arrays.MissingNumber.Solutions;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Missing Number | Leetcode #0268 | Easy
 * https://leetcode.com/problems/missing-number/
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
 */

/**
 * Solution Notes by @wilsonplau - The key insight is that we can use the index
 * to accumulate a running difference to determine the missing number.
 */

public class Solution0001 {

  public static int missingNumber(int[] nums) {

    int i;
    int sum = 0;

    for (i = 0; i < nums.length; i++) {
      sum += nums[i] - i;
    }

    return -(sum - i);

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

    System.out.println("All tests passed.");

  }

}

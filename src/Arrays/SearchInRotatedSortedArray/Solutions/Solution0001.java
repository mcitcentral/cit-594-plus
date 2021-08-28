package Arrays.SearchInRotatedSortedArray.Solutions;

import org.junit.*;
import static org.junit.Assert.*;

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
 * Solution Notes by @wilsonplau - Thinking through the subcase as a subarray
 * helps. In what cases should it go left vs right...
 */

public class Solution0001 {

  public static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target > nums[mid]) {
        if (nums[mid] < nums[left] && target >= nums[left])
          right = mid - 1;
        else
          left = mid + 1;
      } else {
        if (nums[mid] > nums[right] && target <= nums[right])
          left = mid + 1;
        else
          right = mid - 1;
      }
    }

    return -1;
  }

  @Test
  public static void main(String[] args) {

    int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
    assertEquals(4, search(nums1, 0));
    assertEquals(-1, search(nums1, 3));

    int[] nums2 = { 1 };
    assertEquals(-1, search(nums2, 0));

    int[] nums3 = { 4, 5, 6, 7, 8, 1, 2 };
    assertEquals(4, search(nums3, 8));

  }

}

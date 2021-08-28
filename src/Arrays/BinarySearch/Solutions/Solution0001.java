package Arrays.BinarySearch.Solutions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Binary Search | Leetcode #0704 | Easy
 * https://leetcode.com/problems/binary-search/
 * 
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. 
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */

/**
 * Solution Notes by @wilsonplau - A very basic implementation of binary search
 */

public class Solution0001 {

	public static int search(int nums[], int target) {
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int midpoint = left + (int) Math.floor((right - left) / 2);
			if (nums[midpoint] == target) {
				return midpoint;
			} else if (nums[midpoint] < target) {
				left = midpoint + 1;
			} else {
				right = midpoint - 1;
			}
		}

		return -1;
	}

	@Test
	public static void main(String[] args) {
		int[] nums1 = { -1, 0, 3, 5, 9, 12 };
		assertEquals(4, search(nums1, 9));

		int[] nums2 = { -1, 0, 3, 5, 9, 12 };
		assertEquals(-1, search(nums2, 2));
	}
}

package HashSetHashMap.HashSet.ContainsDuplicate;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Contains Duplicate | Leetcode #0217 | Easy
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

/**
 * Solution Notes by @YutianZhang
 * The time complexity is O(nlogn) since we need to sort it first.
 * The idea is if the original brute force is O(n^2), there should be a way to optimize it to O(nlogn) by sorting it first.
 * However, this is not optimal because it is a two pass method, each item is evaluated twice.
 */

public class Solution0001 {

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1; i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }

    @Test
    public static void main(String[] args){

        int[] nums = new int[]{1,2,3,1};
        assertTrue(containsDuplicate(nums));

        nums = new int[]{1,2,3,4};
        assertFalse(containsDuplicate(nums));

        nums = new int[]{1};
        assertFalse(containsDuplicate(nums));

        nums = new int[]{5,4,3,1,2,6,2};
        assertTrue(containsDuplicate(nums));

        System.out.println("All tests passed.");

    }

}

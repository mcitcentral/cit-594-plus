package HashSetHashMap.HashSet.ContainsDuplicate.Solutions;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Contains Duplicate | Leetcode #0217 | Easy
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

/**
 * Solution Notes by @YutianZhang
 * This solution utilizes the HashSet data structure and how its search/contains and add are both o(1).
 * This approach is also better because it is one pass.
 */

public class Solution0002 {

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        Set<Integer> set = new HashSet<>();
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
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

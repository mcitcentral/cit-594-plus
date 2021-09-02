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
 * Solution Notes by _______
 *
 */

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // TODO: Your solution
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

    }

}

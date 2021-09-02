package HashSetHashMap.HashMap.TwoSum;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Ransom Note | Leetcode #0001 | Easy
 * https://leetcode.com/problems/two-sum/
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

/**
 * Solution Notes by @YutianZhang
 * The most optimal time theoretically achievable is O(n) where each element is examined once. Because we are searching
 * for something (target), this hints at a Hashing data structure where searching is O(1).
 * However, we can only look for keys, hence the key is to manipulate the key-value pair in the hash table/hashmap.
 * We introduce the complement variable and store that as keys, and the index to the value that generated this complement
 * as the value.
 * Note that this is an optimal one pass approach where each element is examined once.
 */

public class Solution0001 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target - nums[i], i);
            }
        }
        return null;
    }

    @Test
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        assertEquals(0, twoSum(nums,target)[0]);
        assertEquals(1, twoSum(nums,target)[1]);
    }
}

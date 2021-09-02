package HashSetHashMap.HashMap.RansomNote.Solution;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Ransom Note | Leetcode #0383 | Easy
 * https://leetcode.com/problems/ransom-note/
 *
 * Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 */

/**
 * Solution Notes by @YutianZhang
 * We can use a HashMap and store characters in magazine.
 * We can iterate through ransomNote and use the values in the map
 */

/**
 * Extra Quiz, can you try implementing this via a stack/PriorityQueue? It is going to be slower but its
 *
 */

public class Solution0001 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote == null || ransomNote.isEmpty()) return true;

        Map<Character, Integer> mag_map = new HashMap<>();

        for (char c: magazine.toCharArray()){
            if(mag_map.containsKey(c)){
                mag_map.put(c,mag_map.get(c)+1);
            }else mag_map.put(c,1);
        }

        for (char c: ransomNote.toCharArray()){
            if (mag_map.containsKey(c)){
                if (mag_map.get(c) > 0) {
                    mag_map.put(c,mag_map.get(c) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    @Test
    public static void main(String[] args) {
        String r = "a";
        String m = "b";

        System.out.println(canConstruct(r,m));
    }
}
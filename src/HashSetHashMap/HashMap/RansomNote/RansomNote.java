package HashSetHashMap.HashMap.RansomNote;

import org.junit.Test;

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
 * We can sort the two strings and pop off the front and compare those.
 */

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        // TODO

        return false;
    }

    @Test
    public static void main(String[] args) {
        String r = "a";
        String m = "b";

        System.out.println(canConstruct(r,m));
    }
}

package Arrays.FirstBadVersion.Solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * First Bad Version | Leetcode #278 | Easy
 * https://leetcode.com/problems/first-bad-version/
 * 
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * You must write an algorithm with O(log n) runtime complexity.
 */


/**
* Solution Notes by @Yutian Zhang
*
*/

public class Solution0002 {

 static int match = 0;

   public static int firstBadVersion(int n) {
      int mid = 0;
      int left = 1;
      int right = n-1;

      while (left < right) {
        mid = left + (right - left)/2; // this is to prevent the infamous binary search overflow bug.
        if (isBadVersion(mid)){
          // bad version is to the left
          right = mid;
        } else{
          // bad version is to the right
          left = mid + 1;
        }
      }
      return left;
   }

   static boolean isBadVersion(int version) {
     if (version >= match) return true;
     return false;
   }

   @Test
   public static void main(String[] args) {
     match = 4;
     assertEquals(4, firstBadVersion(5));

     match = 1;
     assertEquals(1, firstBadVersion(1));

     System.out.println("Passed all tests.");
   }

}

package Arrays.FirstBadVersion.Solutions;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * First Bad Version | Leetcode #0278 | Easy
 * https://leetcode.com/problems/first-bad-version/
 * 
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether verssion is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 * You must write an algorithm with O(log n) runtime complexity.
 */

/**
 * Solution Notes by @wilsonplau - A variation of BinarySearch that requires
 * finding an edge instead of a values - Search always checks lower value for
 * edge, so we need to handle the case when it is element 1 - Otherwise, this is
 * quite similar to normal binary search
 */

public class Solution0001 {

  static int match = 0;

  public static int firstBadVersion(int n) {
    int left = 0;
    int right = n;

    if (isBadVersion(1))
      return 1;

    while (left <= right) {
      int midpoint = left + (int) Math.floor((right - left) / 2);
      if (!isBadVersion(midpoint - 1) && isBadVersion(midpoint))
        return midpoint;
      if (isBadVersion(midpoint)) {
        right = midpoint - 1;
      } else {
        left = midpoint + 1;
      }
    }

    return -1;
  }

  static boolean isBadVersion(int version) {
    if (version >= match)
      return true;
    return false;
  }

  @Test
  public static void main(String[] args) {
    match = 4;
    assertEquals(4, firstBadVersion(5));

    match = 1;
    assertEquals(1, firstBadVersion(1));
  }
}

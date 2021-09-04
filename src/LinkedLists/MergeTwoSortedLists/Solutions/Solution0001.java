package LinkedLists.MergeTwoSortedLists.Solutions;

import org.junit.*;
import static org.junit.Assert.*;
import LinkedLists.ListNode;
import java.util.*;

/**
 * Merge Two Sorted Lists | Leetcode #0021 | Easy
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * 
 * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 */

/**
 * Solution Notes by _______
 *
 */

public class Solution0001 {

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode sentinel = new ListNode(-1);
    ListNode curr = sentinel;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        curr.next = l1;
        l1 = l1.next;
      } else {
        curr.next = l2;
        l2 = l2.next;
      }
      curr = curr.next;
    }

    ListNode remainder = l1 == null ? l2 : l1;
    while (remainder != null) {
      curr.next = remainder;
      remainder = remainder.next;
      curr = curr.next;
    }

    return sentinel.next;
  }

  @Test
  public static void main(String[] args) {

    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(4);
    a1.next = a2;
    a2.next = a3;

    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(3);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;

    int[] expected1 = { 1, 1, 2, 3, 4, 4 };
    assertArrayEquals(expected1, mergeTwoLists(a1, b1).toArray());

    assertNull(mergeTwoLists(null, null));

    ListNode c = new ListNode(0);
    int[] expected2 = { 0 };
    assertArrayEquals(expected2, mergeTwoLists(null, c).toArray());

    System.out.println("All tests passed.");

  }

}

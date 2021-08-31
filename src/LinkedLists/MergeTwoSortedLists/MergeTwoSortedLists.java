package LinkedLists.MergeTwoSortedLists;

import org.junit.*;
import static org.junit.Assert.*;
import LinkedLists.ListNode;

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

public class MergeTwoSortedLists {

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    // TODO: Your Solution
    return l1;
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

  }

}

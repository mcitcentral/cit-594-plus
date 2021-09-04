package LinkedLists.LinkedListCycle.Solutions;

import org.junit.*;
import static org.junit.Assert.*;
import LinkedLists.ListNode;
import java.util.*;

/**
 * Linked List Cycle | Leetcode #0141 | Easy
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */

/**
 * Solution Notes by @wilsonplau - Simple solution
 */

public class Solution0001 {

  public static boolean hasCycle(ListNode head) {
    if (head == null)
      return false;
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow)
        return true;
    }
    return false;
  }

  @Test
  public static void main(String[] args) {

    ListNode a1 = new ListNode(3);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(0);
    ListNode a4 = new ListNode(-4);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a2;
    assertTrue(hasCycle(a1));

    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(2);
    b1.next = b2;
    b2.next = b1;
    assertTrue(hasCycle(b1));

    ListNode c1 = new ListNode(1);
    assertFalse(hasCycle(c1));

    System.out.println("All tests passed.");

  }

}

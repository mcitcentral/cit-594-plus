package LinkedLists.ReverseLinkedListII;

import org.junit.*;
import static org.junit.Assert.*;

import LinkedLists.ListNode;

/**
 * Reverse Linked List II | Leetcode #0092 | Medium
 * https://leetcode.com/problems/reverse-linked-list-ii/
 * 
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
 */

/**
 * Solution Notes by _______
 *
 */

public class ReverseLinkedListII {

  public static ListNode reverseBetween(ListNode head, int left, int right) {
    // TODO: Your solution
    return head;
  }

  @Test
  public static void main(String[] args) {

    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    reverseBetween(a1, 2, 4);
    int[] expectedA = { 1, 4, 3, 2, 5 };
    assertArrayEquals(expectedA, a1.toArray());

    ListNode b1 = new ListNode(5);
    reverseBetween(b1, 1, 1);
    int[] expectedB = { 5 };
    assertArrayEquals(expectedB, b1.toArray());

  }

}

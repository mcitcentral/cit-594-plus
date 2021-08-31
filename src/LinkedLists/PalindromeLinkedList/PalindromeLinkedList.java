package LinkedLists.PalindromeLinkedList;

import org.junit.*;
import static org.junit.Assert.*;
import LinkedLists.ListNode;

/**
 * Palindrome Linked List| Leetcode #0234 | Easy
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * Given the head of a singly linked list, return true if it is a palindrome.
 */

/**
 * Solution Notes by _______
 *
 */

public class PalindromeLinkedList {

  public static boolean isPalindrome(ListNode head) {
    // TODO: Your solution
    return true;
  }

  @Test
  public static void main(String[] args) {

    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(2);
    ListNode a4 = new ListNode(1);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    assertTrue(isPalindrome(a1));

    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(2);
    b1.next = b2;
    assertFalse(isPalindrome(b1));

  }

}

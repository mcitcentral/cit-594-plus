package LinkedLists.PalindromeLinkedList.Solutions;

import org.junit.*;
import static org.junit.Assert.*;
import LinkedLists.ListNode;
import java.util.Stack;

/**
 * Palindrome Linked List| Leetcode #0234 | Easy
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * Given the head of a singly linked list, return true if it is a palindrome.
 */

/**
 * Solution Notes by @wilsonplau - Decided to use fast and slow pointers + a
 * stack - Some adjustments required for odd vs even cases. Probably a faster
 * method out there, but this is still O(n)
 */

public class Solution0001 {

  public static boolean isPalindrome(ListNode head) {
    Stack<Integer> stack = new Stack<>();
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      stack.add(slow.val);
      slow = slow.next;
      fast = fast.next.next;
    }

    if (fast != null)
      slow = slow.next;

    while (slow != null) {
      if (slow.val != stack.pop())
        return false;
      slow = slow.next;
    }

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

    ListNode c1 = new ListNode(1);
    ListNode c2 = new ListNode(2);
    ListNode c3 = new ListNode(3);
    ListNode c4 = new ListNode(2);
    ListNode c5 = new ListNode(1);
    c1.next = c2;
    c2.next = c3;
    c3.next = c4;
    c4.next = c5;
    assertTrue(isPalindrome(c1));

  }

}

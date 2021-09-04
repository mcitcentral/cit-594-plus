
package LinkedLists;

import java.util.ArrayList;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
    next = null;
  }

  public int[] toArray() {
    ArrayList<Integer> arr = new ArrayList<>();
    ListNode curr = this;
    while (curr != null) {
      arr.add(curr.val);
      curr = curr.next;
    }
    return arr.stream().mapToInt(Integer::valueOf).toArray();

  }
}

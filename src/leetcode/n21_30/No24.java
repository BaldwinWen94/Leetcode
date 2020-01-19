/*
 * Created By Baldwin Wen
 */

package leetcode.n21_30;

public class No24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        swap(head, dummy);
        return dummy.next;
    }

    private void swap(ListNode node, ListNode before) {
        if (node != null && node.next != null) {
            ListNode tmp = node.next;
            node.next = tmp.next;

            before.next = tmp;
            tmp.next = node;
            swap(node.next, node);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

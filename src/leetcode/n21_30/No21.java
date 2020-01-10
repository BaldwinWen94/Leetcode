/*
 * Created By Baldwin Wen
 */

package leetcode.n21_30;

public class No21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tmp = dummy;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tmp.next = l2;
                tmp = tmp.next;
                l2 = l2.next;
            } else if (l2 == null) {
                tmp.next = l1;
                tmp = tmp.next;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    tmp.next = l1;
                    tmp = tmp.next;
                    l1 = l1.next;
                } else {
                    tmp.next = l2;
                    tmp = tmp.next;
                    l2 = l2.next;
                }
            }
        }
        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

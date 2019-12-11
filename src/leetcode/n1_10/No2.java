/*
 * Created By Baldwin Wen
 */

/*
 * Created By Baldwin Wen
 */

package leetcode.n1_10;

public class No2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rootNode = new ListNode(-1);
        ListNode loopNode = rootNode;
        int flag = 0;

        while (l1 != null || l2 != null || flag != 0) {
            if (l1 != null) {
                flag += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                flag += l2.val;
                l2 = l2.next;
            }

            loopNode.next = new ListNode(flag % 10);
            flag = flag / 10;

            loopNode = loopNode.next;
        }

        return rootNode.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

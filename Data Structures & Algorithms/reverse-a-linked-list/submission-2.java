public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode a = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = a;
            a = cur;
            cur = temp;
        }
        return a;
    }
}
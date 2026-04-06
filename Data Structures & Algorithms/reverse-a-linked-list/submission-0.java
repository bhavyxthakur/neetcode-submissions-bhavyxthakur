public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode cur = head;
        if (head.next != null) {
            cur = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        return cur;
    }
}
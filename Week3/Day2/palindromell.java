package Week3.Day2;

public class palindromell {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseLL(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static void main(String[] args) {

        palindromell obj = new palindromell();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean ans = obj.isPalindrome(head);

        System.out.println(ans);
    }

}

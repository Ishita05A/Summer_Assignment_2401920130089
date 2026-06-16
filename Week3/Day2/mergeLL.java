package Week3.Day2;

public class mergeLL {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode h = new ListNode(100);
        ListNode t = h;
        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            t.next = t2;
        }
        if (t2 == null) {
            t.next = t1;
        }
        return h.next;
    }

    public static void main(String[] args) {

        ListNode t1 = new ListNode(1);
        t1.next = new ListNode(2);
        t1.next.next = new ListNode(4);

        ListNode t2 = new ListNode(1);
        t2.next = new ListNode(3);
        t2.next.next = new ListNode(4);

        ListNode head = mergeTwoLists(t1, t2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}

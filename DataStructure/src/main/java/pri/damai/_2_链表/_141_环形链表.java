package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/10 18:10
 */
public class _141_环形链表 {

    public static boolean hasCycle(ListNode head) {

        ListNode node = head;

        ListNode fast = node;
        ListNode slow = node;

        while (node != null) {

            if (fast.next == null || fast.next.next == null) {
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = null;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node2;

        boolean b = hasCycle(node1);
        System.out.println(b);
    }

}

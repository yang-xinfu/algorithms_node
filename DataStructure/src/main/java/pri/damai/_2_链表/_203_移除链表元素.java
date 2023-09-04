package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/11 12:33
 * just do it.
 */
public class _203_移除链表元素 {

    public static ListNode removeElements(ListNode head, int val) {

        ListNode sentinel = new ListNode();
        sentinel.next = head;

        ListNode node = head;
        ListNode prev = sentinel;

        while (node != null) {

            if (node.val == val) {
                prev.next = node.next;
            } else {
                prev = prev.next;
            }
            node = node.next;
        }

        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;

        ListNode node = removeElements(node1, 6);
        System.out.println(node.toString());
    }

}

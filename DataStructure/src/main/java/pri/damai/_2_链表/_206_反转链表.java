package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/12 11:42
 * just do it.
 */
public class _206_反转链表 {

    public static ListNode reverseList(ListNode head) {

        ListNode node = head;
        ListNode newNode = null;


        while (node != null) {

            ListNode temp = node.next;

            node.next = newNode;

            newNode = node;

            node = temp;

        }

        return newNode;
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

        ListNode node = reverseList(node1);
        System.out.println(node.toString());
    }

}

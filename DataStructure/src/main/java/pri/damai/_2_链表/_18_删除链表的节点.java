package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/5 18:23
 */
public class _18_删除链表的节点 {

    public static ListNode deleteNode(ListNode head, int val) {

        ListNode node = head;

        if (node.val == val) {
            head = head.next;
        }

        while (node.next != null) {

            if (node.next.val == val) {
                node.next = node.next.next;
                return head;
            }

            node = node.next;
        }

        return head;
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode listNode = deleteNode(node1, 4);

        System.out.println(listNode.toString());
    }

}

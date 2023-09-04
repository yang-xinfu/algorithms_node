package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/7 17:20
 */
public class _876_链表的中间节点 {

    public static ListNode middleNode(ListNode head) {

        ListNode node = head;

        int size = 0;
        while (node != null) {
            size ++;
            node = node.next;
        }

        size = (int) Math.ceil(size/2);

        ListNode result = head;
        for (int i = 0; i < size; i++) {
            result = result.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        //ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        //node5.next = null;

        ListNode node = middleNode(node1);

        System.out.println(node.toString());
    }

}

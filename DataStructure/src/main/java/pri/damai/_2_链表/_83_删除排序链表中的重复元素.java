package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/7 16:13
 */
public class _83_删除排序链表中的重复元素 {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode node = head;

        while (node!=null && node.next != null) {

            ListNode twoCycle = node.next;
            while (twoCycle!= null && node.val == twoCycle.val) {
                node.next = node.next.next;
                twoCycle = twoCycle.next;
            }

            node = node.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
//        ListNode node4 = new ListNode(3);
//        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;
//        node4.next = node5;
//        node5.next = null;

        ListNode node = deleteDuplicates(node1);

        System.out.println(node.toString());
    }

}

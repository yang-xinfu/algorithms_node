package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/7 16:04
 */
public class _21_合并两个有序链表 {

    /**
     * 感觉很蠢比
     * @param l1
     * @param l2
     * @return pri.damai.链表.ListNode
     * @author DaMai
     * @date 2020/8/10 16:37
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode oneNode = l1;
        ListNode twoNode = l2;

        ListNode head = new ListNode();
        ListNode nowNode = head;

        while (oneNode != null || twoNode !=null) {

            if (oneNode == null) {
                nowNode.next = twoNode;
                break;
            }

            if (twoNode == null) {
                nowNode.next = oneNode;
                break;
            }

            if (oneNode.val >= twoNode.val) {
                nowNode.next = twoNode;
                twoNode = twoNode.next;
            } else {
                nowNode.next = oneNode;
                oneNode = oneNode.next;
            }

            nowNode = nowNode.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

//        ListNode node4 = new ListNode(1);
//        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(7);

//        node4.next = node5;
//        node5.next = node6;
        node6.next = null;

        ListNode node = mergeTwoLists(node6, node1);

        System.out.println(node.toString());
    }

}

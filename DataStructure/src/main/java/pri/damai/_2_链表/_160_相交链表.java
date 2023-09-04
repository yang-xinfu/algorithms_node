package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/11 11:56
 * just do it.
 */
public class _160_相交链表 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(7);
        ListNode node6 = new ListNode(8);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(10);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        node5.next = node6;
        node6.next = node3;

        System.out.println(node1.toString());
        System.out.println(node5.toString());

        ListNode intersectionNode = getIntersectionNode(node1, node5);
        System.out.println(intersectionNode.toString());

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode headBB = headB;

        while (headA != null) {
            while (headB != null) {

                if (headA == headB) {
                    return headA;
                }

                headB = headB.next;
            }

            headA = headA.next;
            headB = headBB;
        }

        return null;
    }

}

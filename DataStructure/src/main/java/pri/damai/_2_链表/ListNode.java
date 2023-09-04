package pri.damai._2_链表;

/**
 * @author DaMai
 * @description: 链表节点
 * @date 2020/8/5 17:36
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int x) {
        val = x;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {

        ListNode node = next;

        StringBuilder sb = new StringBuilder();
        sb.append(val+",");

        while (node !=null) {
            sb.append(node.val+", ");
            node = node.next;
        }
        return sb.toString();

    }
}

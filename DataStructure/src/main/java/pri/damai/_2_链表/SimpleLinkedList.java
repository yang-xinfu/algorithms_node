package pri.damai._2_链表;

/**
 * @author DaMai
 * @description: 简单链表 增删改查
 * @date 2020/4/29 22:00
 */
public class SimpleLinkedList<E> {

    private Node<E> head = null;
    private int size = 0;

    public static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data;
        }
    }

    /**
     * 获取链表大小
     * @param:
     * @return int
     * @author: DaMai
     * @date: 2020/8/5 17:47
     */
    public int size() {
        return this.size;
    }

    /**
     * 判断链表是否等于为空
     * @param:
     * @return boolean
     * @author: DaMai
     * @date: 2020/8/5 17:48
     */
    public boolean isEmpty() {
        return this.size==0;
    }

    public boolean contains(E e) {
        return indexOf(e) != -1 ;
    }

    /**
     * 添加节点
     * @param: e
     * @return void
     * @author: DaMai
     * @date: 2020/8/5 17:57
     */
    public void add(E e) {

        if (head == null) {
            head = new Node<>(e,null);
        }
        Node<E> node = head;

        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node<>(e, null);
        size ++;
    }

    public E get(int index) {
        return this.getNode(index).data;
    }

    public E set(int index,E e) {

        Node<E> node = this.getNode(index);
        E oldE = node.data;
        node.data = e;

        return oldE;
    }

    public void add(int index,E e) {
        Node<E> node = this.getNode(index-1);

        Node<E> newNode = new Node<E>(e,node.next);

        node.next = newNode;

        size ++;
    }


    public int indexOf(E e) {

        Node<E> node = head;

        for (int i = 0; i < size; i++) {

            if (node.data.equals(e)) {
                return i;
            }
            node = node.next;
        }

        return -1;
    }

    void clear() {
        size = 0;
        head = null;
    }


    public Node<E> getNode(int index) {

        Node<E> node = head;
        for (int i = 0; i <= index; i++) {
            node = node.next;
        }

        return node;
    }

    @Override
    public String toString() {

        Node<E> node = head;

        StringBuilder sb = new StringBuilder();

        sb.append("size=")
                .append(size)
                .append("\n");

        while (node.next!=null) {
            node = node.next;
            sb.append(node.data)
                    .append(", ");
        }

        return sb.toString();
    }
}

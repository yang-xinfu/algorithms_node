package pri.damai._2_链表;

/**
 * @author DaMai
 * @description: 双向链表
 * @date 2020/8/8 16:28
 */
public class LinkedList<E> {

    private Node<E> head = null;
    private Node<E> last = null;
    private int size = 0;

    public static class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            if (prev != null) {
                sb.append(prev.data);
            } else {
                sb.append("null");
            }

            sb.append("_").append(data).append("_");

            if (next != null) {
                sb.append(next.data);
            } else {
                sb.append("null");
            }

            return sb.toString();
        }
    }

    /**
     * 获取链表大小
     *
     * @return int
     * @param:
     * @author: DaMai
     * @date: 2020/8/5 17:47
     */
    public int size() {
        return this.size;
    }

    /**
     * 判断链表是否等于为空
     *
     * @return boolean
     * @param:
     * @author: DaMai
     * @date: 2020/8/5 17:48
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    /**
     * 添加节点
     *
     * @return void
     * @param: e
     * @author: DaMai
     * @date: 2020/8/5 17:57
     */
    public void add(E e) {
        add(size,e);
    }

    public E get(int index) {
        return this.getNode(index).data;
    }

    public E set(int index, E e) {

        Node<E> node = this.getNode(index);
        E oldE = node.data;
        node.data = e;

        return oldE;
    }

    public void add(int index, E e) {

        // index == size 说明往最后面添加元素
        if (index == size) {
            Node<E> oldLast = last;
            last = new Node<>(oldLast, e, null);
            if (oldLast == null) {
                head = last;
            } else {
                oldLast.next = last;
            }

        } else {
            Node<E> next = this.getNode(index);
            Node<E> prev = next.prev;
            Node<E> newNode = new Node<E>(prev, e, next);
            next.prev = newNode;

            if (prev == null) {
                head = newNode;
            } else {
                prev.next = newNode;
            }
        }
        size++;
    }

    public void remove(int index,E e) {

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

    /**
     * 根据索引获取节点
     * 可以根据index与size, 判断从前往后遍历还是从后往前遍历
     *
     * @param index
     * @return pri.damai.链表.Node<E>
     * @author DaMai
     * @date 2020/8/8 16:31
     */
    public Node<E> getNode(int index) {

        Node<E> node;
        if (index < (size >> 1)) {
            node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;

    }

    @Override
    public String toString() {

        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(", [");
        Node<E> node = head;
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                string.append(", ");
            }

            string.append(node);

            node = node.next;
        }
        string.append("]");
        return string.toString();
    }

}

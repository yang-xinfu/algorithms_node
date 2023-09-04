package pri.damai._4_队列;

import java.util.LinkedList;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/14 17:32
 * just do it.
 */
public class SimpleQueue<T> {

    LinkedList<T> linkedList = new LinkedList<T>();

    /**
     * 获取元素个数
     * @return int
     * @author DaMai
     * @date 2020/8/17 10:16
     */
    int size() {
        return linkedList.size();
    }

    /**
     * 判断是否为空
     * @param
     * @return boolean
     * @author DaMai
     * @date 2020/8/17 10:16
     */
    boolean isEmpty() {
        return linkedList.isEmpty();
    }

    /**
     * 入队
     * @param t
     * @return void
     * @author DaMai
     * @date 2020/8/17 10:16
     */
    void  enQueue(T t) {
        linkedList.add(linkedList.size() -1,t);
    }

    /**
     * 出队
     * @param t
     * @return T
     * @author DaMai
     * @date 2020/8/17 10:16
     */
    T deQueue(T t) {
        return linkedList.removeFirst();
    }

    /**
     * 获取队首元素
     * @param
     * @return T
     * @author DaMai
     * @date 2020/8/17 10:16
     */
    T front() {
        return linkedList.getFirst();
    }


}

package pri.damai._3_栈;

import pri.damai._1_动态数组.SimpleArray;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/13 17:59
 * just do it.
 */
public class SimpleStack<T> {

    SimpleArray<T> list = new SimpleArray<T>();

    int size() {
        return list.size();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    void push(T t) throws IllegalAccessException {
        list.add(list.size() -1,t);
    }

    T pop() throws IllegalAccessException {
        return list.del(list.size() - 1);
    }

    T top() throws IllegalAccessException {
        return list.get(list.size() -1);
    }

    void clear() {
        list.clear();
    }
}

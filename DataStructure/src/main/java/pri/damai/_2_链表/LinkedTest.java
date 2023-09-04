package pri.damai._2_链表;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/5 17:57
 */
public class LinkedTest {

    public static void main(String[] args) {

        test02();
    }

    public static void test02() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.toString());
    }

    private static void test01() {
        SimpleLinkedList<Integer> linkedList = new SimpleLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.add(3,8);
        linkedList.set(4,5);

        System.out.println(linkedList.get(2));
        System.out.println(linkedList.toString());
        System.out.println(linkedList.indexOf(11));
    }

}

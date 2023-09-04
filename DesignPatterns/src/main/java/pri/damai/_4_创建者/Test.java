package pri.damai._4_创建者;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/20 16:30
 * just do it.
 */
public class Test {

    public static void main(String[] args) {

        Builder builder = new ProductBuilder();

        Product result = builder.construct("aaa", "bbb", "ccc");

        System.out.println(result);
    }

}

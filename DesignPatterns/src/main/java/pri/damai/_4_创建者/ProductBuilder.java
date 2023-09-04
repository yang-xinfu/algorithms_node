package pri.damai._4_创建者;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/20 16:17
 * just do it.
 */
public class ProductBuilder extends Builder {

    public void buildPartA(String a) {
        p.setPartA(a);
    }

    public void buildPartB(String b) {
        p.setPartB(b);
    }

    public void buildPartC(String c) {
        p.setPartC(c);
    }

    public boolean hasC() {
        return false;
    }

}

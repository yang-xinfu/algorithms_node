package pri.damai._3_工厂._2_工厂方法;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/20 11:42
 * just do it.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new FactoryA();
        Product product = factory.getProduct();
        product.doSomething();
        product.doFinalSomething();
    }

}

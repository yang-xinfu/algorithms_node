package pri.damai._3_工厂._2_工厂方法;

/**
 * @author DaMai
 * @description: 工厂需创建的实例的父类, 目得是统一工厂的返回值及收纳不同对象的公共方法。
 * @date 2020/8/20 10:46
 * just do it.
 */
public abstract class Product {

    public void doFinalSomething() {
        System.out.println("product is over");
    }

    public abstract void doSomething();

}

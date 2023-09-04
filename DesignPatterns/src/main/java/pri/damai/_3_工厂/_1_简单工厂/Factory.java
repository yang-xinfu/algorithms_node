package pri.damai._3_工厂._1_简单工厂;

/**
 * @author DaMai
 * @description: 工厂类, 内部实现所有创建实例的逻辑，并可以直接被外界调用获取不同的实例.
 *               优点：屏蔽复杂逻辑, 简化调用方工作。
 *               缺点：违背开闭原则, 在新增角色时必须修改工厂逻辑。
 *               使用场景：工厂负责创建的对象较少，创建逻辑较简单，想简化调用方逻辑。
 * @date 2020/8/20 10:43
 * just do it.
 */
public class Factory {

    public static Product getProduct(String productName) {

        if ("A".equals(productName)) {
            return new ProductA();
        }

        if ("B".equals(productName)) {
            return new ProductB();
        }

        return null;
    }

    public static void main(String[] args) {
        //Product product = getProduct("A");
        Product product = getProduct("B");
        product.doSomething();
        product.doFinalSomething();
    }



}

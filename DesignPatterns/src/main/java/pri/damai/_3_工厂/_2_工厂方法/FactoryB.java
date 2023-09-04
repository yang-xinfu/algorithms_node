package pri.damai._3_工厂._2_工厂方法;

/**
 * @author DaMai
 * @description: 具体工厂. 工厂方法返回具体产品.
 * @date 2020/8/20 11:37
 * just do it.
 */
public class FactoryB implements Factory {
    @Override
    public Product getProduct() {
        return new ProductB();
    }
}

package pri.damai._3_工厂._2_工厂方法;

/**
 * @author DaMai
 * @description: 抽象工厂类. 声明工厂方法, 所有具体工厂类都需实现它.
 *               优点：符合开闭原则，增加新产品不需要改变原有逻辑。
 *                    基于工厂角色和产品角色的多态性设计是工厂方法模式的关键，完全屏蔽产品的创建细节。
 *               缺点：添加了系统的复杂度. 外部调用时，完全以抽象形式调用。
 *                    系统额外开销。需要的类成倍增加。
 *               适用场景： 外界不关心具体产品，只需拿到产品使用即可。
 * @date 2020/8/20 10:43
 * just do it.
 */
public interface Factory {
    Product getProduct();
}

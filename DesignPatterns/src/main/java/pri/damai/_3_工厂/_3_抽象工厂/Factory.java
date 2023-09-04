package pri.damai._3_工厂._3_抽象工厂;

/**
 * @author DaMai
 * @description: 抽象工厂
 *               声明一组用于创建一组(不同)抽象产品的方法, 每一个方法对应一种抽象产品。
 *               优点：完全抽象，对客户端进一步屏蔽。保证客户端使用 同一族(指具体工厂)的不同产品。
 *               缺点：增加不同产品，需要修改代码，不符合开闭原则。
 *               适用场景：系统中有多个产品族，但每次只选择一个适用，且强制要求同一产品族的产品，必须在一起使用。
 *                          抽象产品结构稳定，大概率不会新增删除抽象产品。
 * @date 2020/8/20 10:43
 * just do it.
 */
public interface Factory {

    KongTiao getKongTiao();

    YaShua getYaShua();

}

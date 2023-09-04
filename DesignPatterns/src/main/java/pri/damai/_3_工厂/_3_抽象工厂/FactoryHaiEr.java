package pri.damai._3_工厂._3_抽象工厂;

/**
 * @author DaMai
 * @description: 具体工厂类（海尔工厂) 声明了一组产品
 *               实现了在抽象工厂中创建一组(不同)抽象产品的方法，生成具体产品。
 *               这些具体产品构成了一个产品族。
 * @date 2020/8/20 11:37
 * just do it.
 */
public class FactoryHaiEr implements Factory {

    @Override
    public KongTiao getKongTiao() {
        return new KongTiaoHaiEr();
    }

    @Override
    public YaShuaHaiEr getYaShua() {
        return new YaShuaHaiEr();
    }
}

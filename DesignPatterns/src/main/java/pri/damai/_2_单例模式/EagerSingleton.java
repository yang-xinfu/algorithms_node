package pri.damai._2_单例模式;

/**
 * @author DaMai
 * @description: 饿汉式单例
 * @date 2020/8/17 14:56
 * just do it.
 */
public class EagerSingleton {

    private static final EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return singleton;
    }

}

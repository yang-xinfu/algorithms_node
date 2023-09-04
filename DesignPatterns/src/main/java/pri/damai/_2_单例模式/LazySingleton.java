package pri.damai._2_单例模式;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/17 14:58
 * just do it.
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton() {}

    // 最好的方式
    public static LazySingleton getInstance3() {
        return HolderClass.ins;
    }
    public static class HolderClass {
        private final static LazySingleton ins = new LazySingleton();
    }

    // 双重检查锁 线程安全
    public static LazySingleton getInstance2() {

        if (singleton == null) {

            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }

    // 线程不安全
    synchronized public static LazySingleton getInstance1() {

        if (singleton == null) {
            singleton = new LazySingleton();
        }

        return singleton;
    }

}

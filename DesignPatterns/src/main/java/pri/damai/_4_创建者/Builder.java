package pri.damai._4_创建者;

/**
 * @author DaMai
 * @description:
 * @date 2020/8/20 16:14
 */
public abstract class Builder {

    protected Product p = new Product();

    public abstract void buildPartA(String a);
    public abstract void buildPartB(String b);
    public abstract void buildPartC(String c);

    // 钩子方法 通过判断此方法，确定需不需要设置C属性。需要设置此值的，应在具体创建者中重写该方法
    public boolean hasC() {
        return true;
    }

    public Product construct(String a, String b, String c) {
        this.buildPartA(a);
        this.buildPartB(b);
        // 如果重写了，则调用的是重写后的方法。
        if (hasC()) {
            this.buildPartC(c);
        } else {
            this.buildPartC("不需要");
        }
        return p;
    }

}

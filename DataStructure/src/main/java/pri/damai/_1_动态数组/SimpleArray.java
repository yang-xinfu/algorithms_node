package pri.damai._1_动态数组;

/**
 * @author DaMai
 * @description:
 * @date 2020/4/28 21:43
 */
public class SimpleArray<T> {

    private T[] data;
    private int size;

    /**
     * 有参，初始化数组
     * @param capacity
     */
    public SimpleArray(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * 无参，初始化数组
     */
    public SimpleArray() {
        this(10);
    }

    public void clear() {
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 添加元素 O(m+n)
     * @param index 索引
     * @param ele 元素
     * @throws IllegalAccessException
     */
    public void add(int index,T ele) throws IllegalAccessException {

        checkIndex(index);

        //如果（容量=实际个数）
        if (this.size == data.length ) {
            //扩容 两倍
            resize(this.data.length * 2);
        }

        //该索引之后的数组都需要往后退一位
        for (int i = this.size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }

        data[index] = ele;
        size++;
    }

    /**
     * 获取索引对应的元素
     * @param index 索引
     * @return 元素
     * @throws IllegalAccessException
     */
    public T get(int index) throws IllegalAccessException {
        checkIndex(index);
        return data[index];
    }

    /**
     * 修改元素
     * @param index
     * @param ele
     * @throws IllegalAccessException
     */
    public void set(int index, T ele) throws IllegalAccessException {
        checkIndex(index);
        data[index] = ele;
    }

    /**
     * 删除元素
     * @param index
     * @return
     * @throws IllegalAccessException
     */
    public T del(int index) throws IllegalAccessException {

        checkIndex(index);

        T t = data[index];

        //index后的所有元素，向前一位
        for (int i = index + 1 ; i <= this.size - 1; i++) {
            data[i - 1] = data[i];
        }
        size--;

        //缩容判断
        if (this.size == data.length / 4 ) {
            resize(data.length / 2);
        }

        return t;
    }

    /**
     * 扩容 O(n)
     * @param capacity
     */
    public void resize(int capacity) {

        System.out.println("触发扩容：扩容至"+capacity);

        T[] resizeArray = (T[]) new Object[capacity];

        for (int i = 0; i < this.size; i++) {
            resizeArray[i] = data[i];
        }

        data = resizeArray;

    }



    private void checkIndex(int index) throws IllegalAccessException {
        if (index <0 || index > this.size) {
            throw new IllegalAccessException("index error");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("SimpleArray capacity= %d size= %d \n",data.length,this.size));
        sb.append("[");

        for (int i = 0; i < this.size; i++) {
            try {
                sb.append(get(i));

                if (i != this.size-1){
                    sb.append(",");
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        sb.append("]");
        return sb.toString();
    }
}

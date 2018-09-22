package cn.mydoudou.singleton;

/**
 * @author fut
 * @description 简单单例模式，线程不安全的，懒汉模式
 * @create 2018-09-22
 * @wiki
 */
public class SimpleSingleton {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static SimpleSingleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private SimpleSingleton() {
    }

    /**
     * 静态工程方法，创建实例
     */
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return instance;
    }

}

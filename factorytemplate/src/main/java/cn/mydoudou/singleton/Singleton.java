package cn.mydoudou.singleton;

/**
 * @author fut
 * @description 简单单例模式，线程不安全的，懒汉模式，
 * 这种方式在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快。
 * 这种方式基于类加载机制避免了多线程的同步问题
 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到懒加载的效果
 * @create 2018-09-22
 * @wiki
 */
public class Singleton {
    /**
     * 持有私有静态实例，防止被引用
     */
    private static Singleton instance = new Singleton();

    /**
     * 私有构造方法，防止被实例化
     */
    private Singleton() {
    }

    /**
     * 静态方法
     */
    public static Singleton getInstance() {
        return instance;
    }


    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return getInstance();
    }

}

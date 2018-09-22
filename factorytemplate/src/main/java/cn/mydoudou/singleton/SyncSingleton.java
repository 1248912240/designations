package cn.mydoudou.singleton;

/**
 * @author fut
 * @description 简单单例模式，线程安全，每次调用getInstance()，都要对对象上锁，效率极低
 * @create 2018-09-22
 * @wiki
 */
public class SyncSingleton {
    /**
     * 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
     */
    private static SyncSingleton instance = null;

    /**
     * 私有构造方法，防止被实例化
     */
    private SyncSingleton() {
    }

    /**
     * 静态工程方法，创建实例
     */
    public static synchronized SyncSingleton getInstance() {
        if (instance == null) {
            instance = new SyncSingleton();
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

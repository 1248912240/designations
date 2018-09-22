package cn.mydoudou.singleton;

/**
 * @author fut
 * @description 枚举单例的优点就是简单，但是大部分应用开发很少用枚举，可读性并不是很高，不建议用
 * @create 2018-09-22
 * @wiki
 */
public enum EnumSingleton {
    INSTANCE;

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return EnumSingleton.INSTANCE;
    }
}

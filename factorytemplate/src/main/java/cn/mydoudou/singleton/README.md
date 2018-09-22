单例对象（Singleton）是一种常用的设计模式。  
在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。这样的模式有几个好处：  
1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。  
2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。  
3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。  
4、单例设计模式7种：1. 饿汉模式,2. 懒汉模式（线程不安全）,3. 懒汉模式（线程安全）  
                 4. 双重检查模式 （DCL）,5. 静态内部类单例模式,6. 枚举单例,  
                 7. 使用容器实现单例模式：  
                 
                 public class SingletonManager {  
                 　　private static Map<String, Object> objMap = new HashMap<String,Object>();
                 　　private Singleton() { 
                 　　}
                 　　public static void registerService(String key, Objectinstance) {
                 　　　　if (!objMap.containsKey(key) ) {
                 　　　　　　objMap.put(key, instance) ;
                 　　　　}
                 　　}
                 　　public static ObjectgetService(String key) {
                 　　　　return objMap.get(key) ;
                 　　}
                 }  
                 
                 用SingletonManager 将多种的单例类统一管理，在使用时根据key获取对象对应类型的对象。  
                 这种方式使得我们可以管理多种类型的单例，并且在使用时可以通过统一的接口进行获取操作，  
                 降低了用户的使用成本，也对用户隐藏了具体实现，降低了耦合度
                 
5、前6种有一种情况下他们会重新创建对象，那就是反序列化，  
   将一个单例实例对象写到磁盘再读回来，从而获得了一个实例。  
   反序列化操作提供了readResolve方法，这个方法可以让开发人员控制对象的反序列化。在上述的几个方法示例中如果要杜绝单例对象被反序列化是重新生成对象，就必须加入如下方法：  
     
     private Object readResolve() throws ObjectStreamException{
       return singleton;
     }
     
add 参考文献：  
https://blog.csdn.net/itachi85/article/details/50510124



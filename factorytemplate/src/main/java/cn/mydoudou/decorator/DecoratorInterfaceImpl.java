package cn.mydoudou.decorator;

/**
 * @author fut
 * @description 接口实现
 * @create 2018-09-22
 * @wiki
 */
public class DecoratorInterfaceImpl implements DecoratorInterface {
    public void send() {
        System.out.println("sending ...");
    }
}

package cn.mydoudou.factories.abstructfactory;

import cn.mydoudou.factories.simplefactory.Sender;

/**
 * @author fut
 * @description
 * @create 2018-09-22
 * @wiki
 */
public class Test {
    public static void main(String[] args) {
        Providor provider = new SmsFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}

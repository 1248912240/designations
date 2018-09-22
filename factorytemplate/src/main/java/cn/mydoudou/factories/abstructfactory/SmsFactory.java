package cn.mydoudou.factories.abstructfactory;

import cn.mydoudou.factories.simplefactory.Sender;
import cn.mydoudou.factories.simplefactory.SmsSender;

/**
 * @author fut
 * @description 工厂
 * @create 2018-09-22
 * @wiki
 */
public class SmsFactory implements Providor {
    public Sender produce() {
        return new SmsSender();
    }
}

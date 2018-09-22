package cn.mydoudou.factories.abstructfactory;

import cn.mydoudou.factories.simplefactory.EmailSender;
import cn.mydoudou.factories.simplefactory.Sender;

/**
 * @author fut
 * @description 工厂
 * @create 2018-09-22
 * @wiki
 */
public class EmailFactory implements Providor {
    public Sender produce() {
        return new EmailSender();
    }
}

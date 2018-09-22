package cn.mydoudou.builders;

import cn.mydoudou.factories.simplefactory.EmailSender;
import cn.mydoudou.factories.simplefactory.Sender;
import cn.mydoudou.factories.simplefactory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fut
 * @description 建造者模式
 * @create 2018-09-22
 * @wiki
 */
public class BuilderTemplate {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new EmailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}

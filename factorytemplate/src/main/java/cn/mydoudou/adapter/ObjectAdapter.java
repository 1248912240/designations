package cn.mydoudou.adapter;

/**
 * @author fut
 * @description 适配器，2、对象的适配
 * @create 2018-09-22
 * @wiki
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void smsSending() {
        source.smsSending();
    }

    public void emailSending() {
        System.out.println("sending email ...");
    }
}

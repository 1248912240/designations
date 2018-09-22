package cn.mydoudou.adapter;

/**
 * @author fut
 * @description 适配器, 1,类的适配
 * @create 2018-09-22
 * @wiki
 */
public class ClassAdapter extends Source implements Targetable {

    public void emailSending() {
        System.out.println("sending email ...");
    }
}

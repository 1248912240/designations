package cn.mydoudou.factories.simplefactory;

/**
 * @author fut
 * @description 短信发送
 * @create 2018-09-22
 * @wiki
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println("send a sms...");
    }
}

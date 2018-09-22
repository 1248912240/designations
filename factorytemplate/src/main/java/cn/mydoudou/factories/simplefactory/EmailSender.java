package cn.mydoudou.factories.simplefactory;

/**
 * @author fut
 * @description 邮件发送
 * @create 2018-09-22
 * @wiki
 */
public class EmailSender implements Sender {
    public void send() {
        System.out.println("send a email ...");
    }
}

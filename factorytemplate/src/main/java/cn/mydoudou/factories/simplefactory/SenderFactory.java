package cn.mydoudou.factories.simplefactory;

/**
 * @author fut
 * @description 工厂
 * @create 2018-09-22
 * @wiki
 */
public class SenderFactory {

    private Sender sender;

    public void sendMsg(){
        sender = new SmsSender();
        sender.send();
    }

    public void sendEmail(){
        sender = new EmailSender();
        sender.send();
    }

}

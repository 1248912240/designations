#### 第一种简单工厂
    public Sender produce(String type) {
            if ("mail".equals(type)) {
                return new MailSender();
            } else if ("sms".equals(type)) {
                return new SmsSender();
            } else {
                System.out.println("请输入正确的类型!");
                return null;
            }
        }
    
#### 第二种,多工厂方法

    public class SendFactory {
        
        public Sender produceMail(){
            return new MailSender();
        }
        
        public Sender produceSms(){
            return new SmsSender();
        }
    }
   
#### 第三种 静态工厂方法

    public class SendFactory {
        
        public static Sender produceMail(){
            return new MailSender();
        }
        
        public static Sender produceSms(){
            return new SmsSender();
        }
    }


工厂模式适合：  
凡是出现了大量的产品需要创建，并且具有共同的接口时，  
可以通过工厂方法模式进行创建。在以上的三种模式中，  
第一种如果传入的字符串有误，不能正确创建对象，  
第三种相对于第二种，不需要实例化工厂类，  
所以，大多数情况下，我们会选用第三种——静态工厂方法模式
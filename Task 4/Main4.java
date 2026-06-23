
public class Main4 {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alterUser("Hello via Email");

        MessageSender sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alterUser("Hello via SMS");

    }
}
 interface MessageSender{
    void sendMessage(String message);
} 

class EmailSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending email: "+message);
    }
}
class SMSSender implements MessageSender{
    public void sendMessage(String message){
        System.out.println("Sending SMS: "+ message);
    }
}
class NotificationService {
    private MessageSender sender;
    public NotificationService(MessageSender sender){
        this.sender = sender;
    }
    public void alterUser(String msg){
        sender.sendMessage(msg);
    }
}

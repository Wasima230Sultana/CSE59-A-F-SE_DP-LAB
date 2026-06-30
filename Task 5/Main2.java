


interface MessageSender {

    void sendMessage(String message);
}

class EmailSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending email : " + message);
    }
}

class SMSSender implements MessageSender {

    public void sendMessage(String message) {
        System.out.println("Sending SMS : " + message);

    }
}

class NotificationService {

    private MessageSender sender;

    public NotificationService(MessageSender sender) {
        this.sender = sender;

    }

    public void alterUser(String msg) {
        sender.sendMessage(msg);
    }
}

public class Main2{
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        NotificationService emailService = new NotificationService(email);
        emailService.alterUser("Meeting starts at 10 AM");
        System.out.println();

        MessageSender sms = new SMSSender();
        NotificationService smsService = new NotificationService(sms);
        smsService.alterUser("Your OTP is 123456");
    }
}

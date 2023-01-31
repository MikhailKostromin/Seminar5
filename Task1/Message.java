package Task1;

public class EmailMessage implements IMeassage {
    @Override
    public void sendMessage(String typeMessage, String message) {

        if (typeMessage.equals("e-mail")) {
            //e-mail
            //use JAVA mail sender API
        }
    }
}

public class SMSMessage implements IMeassage {
    @Override
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("SMS")) {
            //SMS
        }
    }
}

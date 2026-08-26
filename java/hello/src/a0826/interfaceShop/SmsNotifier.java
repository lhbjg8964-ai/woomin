package a0826.interfaceShop;

public class SmsNotifier implements Notifier{

    @Override
    public void send(String massage) {
        System.out.println("[SMS]" + massage);
        
    }
    
}

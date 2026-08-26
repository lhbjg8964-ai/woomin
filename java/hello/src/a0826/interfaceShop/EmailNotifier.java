package a0826.interfaceShop;

public class EmailNotifier implements Notifier{

    @Override
    public void send(String massage) {
        System.out.println("[Email]"+ massage);
        
    }
    
}

package observerDesign.observer;

import observerDesign.observer.*;
import observerDesign.observable.ObservableInterface;

public class ObserverConcreteClass implements ObserverInterface {
    String emailId;
    ObservableInterface obj;
    public ObserverConcreteClass(String emailId, ObservableInterface obj) {
        this.emailId = emailId;
        this.obj = obj;
    }
    
    @Override
    public void update(){
        sendMail(emailId, "Product is available");
    }

    public void sendMail(String emailId, String msg){
        System.out.println("mail sent to:" + emailId);
    }
}
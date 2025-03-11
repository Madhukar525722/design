package observerDesign;

import observerDesign.observable.*;
import observerDesign.observer.*;

public class Main {
    public static void main(String args[]) {
        ObservableInterface tobeobserved = new ObservableConcreteClass();

        ObserverInterface observer1 = new ObserverConcreteClass("madlnu@test.com", tobeobserved);
        ObserverInterface observer2 = new ObserverConcreteClass("madhu@test.com", tobeobserved);

        tobeobserved.add(observer1);
        tobeobserved.add(observer2);

        tobeobserved.setData(3);
    }
}
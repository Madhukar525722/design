package observerDesign.observable;

import observerDesign.observer.ObserverInterface;

public interface ObservableInterface {
    public void add(ObserverInterface obj);

    public void remove(ObserverInterface obj);

    public void notifyObservers();

    public void setData(int value);

    public int getData();
}
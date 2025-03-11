package observerDesign.observable;

import observerDesign.observable.*;
import observerDesign.observer.*;

import java.util.ArrayList;
import java.util.List;

public class ObservableConcreteClass implements ObservableInterface {
    public int data = 0;
    public List<ObserverInterface> objlist = new ArrayList<>();

    @Override
    public void add(ObserverInterface obj){
        objlist.add(obj);
    }

    @Override
    public void remove(ObserverInterface obj){
        objlist.remove(obj);
    }

    @Override
    public void notifyObservers(){
        for(ObserverInterface obj : objlist){
            obj.update();
        }
    }

    public int getData(){
        return data;
    }

    public void setData(int dataIncrease){
        if(data==0){
            notifyObservers();
        }
        data = data + dataIncrease;
    }
}
package elevatorSystem;

public class InternalButton {
    InternalButtonDispatcher dispatcher = new InternalButtonDispatcher();

    public int[] availableButtons = {1,2,3,4,5,6,7,8,9,10};
    public int buttonSelected;
    public void pressButton(int destination, Elevator elevator){
        dispatcher.submitRequest(destination, elevator);
    }
}

package elevatorSystem;

public class ExternalButton {
    ExternalButtonDispatcher dispatcher = new ExternalButtonDispatcher();

    public void pressButton(Floor floor, Direction dir){
        dispatcher.submitRequest(floor.id, dir);
    }

}

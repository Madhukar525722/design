package elevatorSystem;

import java.util.*;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllers = ElevatorCreator.elevatorControllerList;
    int elevators = ElevatorCreator.elevatorCount;

    public void submitRequest(int destination, Elevator elevator){
        for(int i=1; i <= elevators; i++){
            if(elevator.id == elevatorControllers.get(i).elevatorObject.id){
                if(destination > elevator.currentFloor) {
                    elevatorControllers.get(i).submitInternalRequest(destination, Direction.up);
                }
                else {
                    elevatorControllers.get(i).submitInternalRequest(destination, Direction.down);
                }
            }
        }
    }
}

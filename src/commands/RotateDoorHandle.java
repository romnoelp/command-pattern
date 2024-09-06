package commands;

import devices.AutomaticDoor;

public class RotateDoorHandle implements Command {
    private final AutomaticDoor automaticDoor;

    public RotateDoorHandle(AutomaticDoor automaticDoor) {
        this.automaticDoor = automaticDoor;
    }

    @Override
    public void execute() {
        automaticDoor.openDoor();
    }
}

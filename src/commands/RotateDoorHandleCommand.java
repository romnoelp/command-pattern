package commands;

import devices.AutomaticDoor;

public class RotateDoorHandleCommand implements Command {
    private final AutomaticDoor automaticDoor;

    public RotateDoorHandleCommand(AutomaticDoor automaticDoor) {
        this.automaticDoor = automaticDoor;
    }

    @Override
    public void execute() {
        automaticDoor.openDoor();
    }
}

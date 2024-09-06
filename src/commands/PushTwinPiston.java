package commands;

import devices.AutomaticDoor;

public class PushTwinPiston implements Command {
    private final AutomaticDoor automaticDoor;

    public PushTwinPiston(AutomaticDoor automaticDoor) {
        this.automaticDoor = automaticDoor;
    }

    @Override
    public void execute() {
        automaticDoor.closeDoor();
    }
}

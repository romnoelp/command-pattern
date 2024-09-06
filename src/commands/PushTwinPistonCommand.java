package commands;

import devices.AutomaticDoor;

public class PushTwinPistonCommand implements Command {
    private final AutomaticDoor automaticDoor;

    public PushTwinPistonCommand(AutomaticDoor automaticDoor) {
        this.automaticDoor = automaticDoor;
    }

    @Override
    public void execute() {
        automaticDoor.closeDoor();
    }
}

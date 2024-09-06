package commands;

import devices.Curtain;

public class CloseCurtainCommand implements Command {
    private final Curtain curtain;

    public CloseCurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.closeCurtain();
    }
}

package commands;

import devices.Curtain;

public class OpenCurtainCommand implements Command {
    private final Curtain curtain;

    public OpenCurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.openCurtain();
    }
}

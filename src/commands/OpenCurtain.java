package commands;

import devices.Curtain;

public class OpenCurtain implements Command {
    private final Curtain curtain;

    public OpenCurtain(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.openCurtain();
    }
}

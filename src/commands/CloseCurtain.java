package commands;

import devices.Curtain;

public class CloseCurtain implements Command {
    private final Curtain curtain;

    public CloseCurtain(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        curtain.closeCurtain();
    }
}

package commands;

// This class exists just to avoid null reference pointer exception in the ESP32 class. 
public class NoOperationCommand implements Command {
    @Override
    public void execute() {

    }
}

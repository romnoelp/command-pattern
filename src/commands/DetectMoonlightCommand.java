package commands;

import devices.DaylightSensor;

public class DetectMoonlightCommand implements Command {
    private final DaylightSensor sensor;

    public DetectMoonlightCommand(DaylightSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        sensor.turnToMoonlight();
    }
}

package commands;

import devices.DaylightSensor;

public class DetectSunlightCommand implements Command {
    private final DaylightSensor sensor;

    public DetectSunlightCommand(DaylightSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        sensor.turnToSunlight();
    }
}

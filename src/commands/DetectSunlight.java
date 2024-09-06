package commands;

import devices.DaylightSensor;

public class DetectSunlight implements Command {
    private final DaylightSensor sensor;

    public DetectSunlight(DaylightSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        sensor.turnToSunlight();
    }
}

package commands;

import devices.DaylightSensor;

public class DetectMoonlight implements Command {
    private final DaylightSensor sensor;

    public DetectMoonlight(DaylightSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        sensor.turnToMoonlight();
    }
}

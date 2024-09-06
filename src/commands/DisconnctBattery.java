package commands;

import devices.SolarCharger;

public class DisconnctBattery implements Command {
    private final SolarCharger solarCharger;

    public DisconnctBattery(SolarCharger solarCharger) {
        this.solarCharger = solarCharger;
    }

    @Override
    public void execute() {
        solarCharger.stopCharging();
    }
}

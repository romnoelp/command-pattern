package commands;

import devices.SolarCharger;

public class DisconnectBatteryCommand implements Command {
    private final SolarCharger solarCharger;

    public DisconnectBatteryCommand(SolarCharger solarCharger) {
        this.solarCharger = solarCharger;
    }

    @Override
    public void execute() {
        solarCharger.stopCharging();
    }
}

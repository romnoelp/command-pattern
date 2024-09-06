package commands;

import devices.SolarCharger;

public class ChargeBatteryCommand implements Command {
    private final SolarCharger charger;

    public ChargeBatteryCommand(SolarCharger charger) {
        this.charger = charger;
    }

    @Override
    public void execute() {
        charger.startCharging();
    }
}

package commands;

import devices.SolarCharger;

public class ChargeBattery implements Command {
    private final SolarCharger charger;

    public ChargeBattery(SolarCharger charger) {
        this.charger = charger;
    }

    @Override
    public void execute() {
        charger.startCharging();
    }
}

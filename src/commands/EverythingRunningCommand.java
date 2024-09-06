package commands;

import devices.AutomaticDoor;
import devices.Curtain;
import devices.DaylightSensor;
import devices.SolarCharger;

public class EverythingRunningCommand implements Command{
    AutomaticDoor automaticDoor;
    Curtain curtain;
    DaylightSensor daylightSensor;
    SolarCharger solarCharger;

    public EverythingRunningCommand(AutomaticDoor automaticDoor, Curtain curtain, DaylightSensor daylightSensor, SolarCharger solarCharger) {
        this.automaticDoor = automaticDoor;
        this.curtain = curtain;
        this.daylightSensor = daylightSensor;
        this.solarCharger = solarCharger;
    }

    @Override
    public void execute() {
        automaticDoor.openDoor();
        curtain.openCurtain();
        daylightSensor.turnToSunlight();
        solarCharger.startCharging();
    }
}

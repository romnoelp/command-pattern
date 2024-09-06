package commands;

import devices.AutomaticDoor;
import devices.Curtain;
import devices.DaylightSensor;
import devices.SolarCharger;

public class EverythingTurnedOffCommand implements Command {
    AutomaticDoor automaticDoor;
    Curtain curtain;
    DaylightSensor daylightSensor;
    SolarCharger solarCharger;

    public EverythingTurnedOffCommand(AutomaticDoor automaticDoor, Curtain curtain, DaylightSensor daylightSensor, SolarCharger solarCharger) {
        this.automaticDoor = automaticDoor;
        this.curtain = curtain;
        this.daylightSensor = daylightSensor;
        this.solarCharger = solarCharger;
    }

    @Override
    public void execute() {
        automaticDoor.closeDoor();
        curtain.closeCurtain();
        daylightSensor.turnToMoonlight();
        solarCharger.stopCharging();
    }
}

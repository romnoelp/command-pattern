import commands.ChargeBatteryCommand;
import commands.DisconnectBatteryCommand;
import commands.EverythingRunningCommand;
import commands.EverythingTurnedOffCommand;
import devices.AutomaticDoor;
import devices.Curtain;
import devices.DaylightSensor;
import devices.SolarCharger;

public static void main(String[] args) {
//     No commands passed
//        ESP32 esp32 = new ESP32();
//
//        // Prints out the activated commands, if there are any.
//        System.out.println(esp32);

// --------------------------------------------
    
    //Scenario 2 - One device turned on.

    ESP32 esp32 = new ESP32();

    SolarCharger solarCharger = new SolarCharger();

    esp32.setCommand(0, new ChargeBatteryCommand(solarCharger), new DisconnectBatteryCommand(solarCharger));

    esp32.activateDevice(0);
    esp32.deactivateDevice(0);  // Uncomment to deactivate the device/s.
    System.out.println(esp32);

    //-----------------------------------------
    //Scenario 3 - Everything turned on.

//    ESP32 esp32 = new ESP32();
//
//    AutomaticDoor automaticDoor = new AutomaticDoor();
//    Curtain curtain = new Curtain();
//    DaylightSensor daylightSensor = new DaylightSensor();
//    SolarCharger solarCharger = new SolarCharger();
//
//    esp32.setCommand(1, new EverythingRunningCommand(automaticDoor, curtain, daylightSensor, solarCharger), new EverythingTurnedOffCommand(automaticDoor, curtain, daylightSensor, solarCharger));
//
//    esp32.activateDevice(1);
//    esp32.deactivateDevice(1);
//    System.out.println(esp32);
}

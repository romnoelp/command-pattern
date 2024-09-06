// An ESP32 is a microcontroller embedded on a device like an Arduino.
// It offers great connectvity options such as bluetooth and WIFI making
// it a great option for people making their houses equipped with 
// smart home functionalities.

import commands.Command;
import commands.NoOperationCommand;

public class ESP32 {
    Command[] runningDevices;
    Command[] turnedOffDevices;
    int commandSlots = 4;

    public ESP32() {
        runningDevices = new Command[commandSlots];
        turnedOffDevices = new Command[commandSlots];

        for (int i = 0; i < commandSlots; i++) {
            runningDevices[i] = new NoOperationCommand();
            turnedOffDevices[i] = new NoOperationCommand();
        }
    }

    public void setCommand(int commandSlot, Command turnedOnCommand, Command turnedOffCommand) {
        if (turnedOnCommand == null || turnedOffCommand == null) {
            throw new IllegalArgumentException("Command cannot be null");
        } else {
            runningDevices[commandSlot] = turnedOnCommand;
            turnedOffDevices[commandSlot] = turnedOffCommand;
        }
    }

    public void activateDevice(int commandSlot) {
        runningDevices[commandSlot].execute();
    }

    public void deactivateDevice(int commandSlot) {
        turnedOffDevices[commandSlot].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n******ESP32******\n");
        for (int i = 0; i < commandSlots; i++) {
            stringBuilder.append("Command:").append(i).append(" - ").append(runningDevices[i].getClass().getSimpleName()).append("(").append(runningDevices.getClass().getSimpleName()).append(")").append(" - ").append(turnedOffDevices[i].getClass().getSimpleName()).append("(").append(turnedOffDevices.getClass().getSimpleName()).append(")").append("\n");
        }

        return stringBuilder.toString();
    }
}

package devices;

public class DaylightSensor {
    public void turnToSunlight() {
        System.out.println("Internal clock exceeded 6:30, opening to detect sunlight.");
    }
    
    public void turnToMoonlight() {
        System.out.println("Internal clock exceeded 18:30, maintaing position, but tracking the moon.");
    }
}

package SchoolAssignments;

public class Vehicle {
    private int wheels;
    private String make;

    public Vehicle(int wheels, String make) {
        this.wheels = wheels;
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}

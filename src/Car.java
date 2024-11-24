public class Car extends Vehicle {
    private String model;
    private String engineName;

//    public Car(String m, String e)
//    {
//        model = m;
//        engineName = e;
//    }

    public Car(int wheels, String make, String model, String engineName) {
        super(wheels, make);
        this.model = model;
        this.engineName = engineName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }


}

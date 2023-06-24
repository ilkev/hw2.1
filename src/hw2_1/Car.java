package hw2_1;

public class Car extends MechanicalTransport {

    public Car(String modelName) {
        super(modelName, 4);
    }
    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }
}

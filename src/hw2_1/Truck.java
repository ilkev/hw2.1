package hw2_1;

public class Truck extends MechanicalTransport {

    public Truck(String modelName) {
        super(modelName, 4);
    }
    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        super.service();
        checkTrailer();
    }
}

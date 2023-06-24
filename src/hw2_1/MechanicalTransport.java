package hw2_1;

public abstract class MechanicalTransport extends AllTransport {
    public MechanicalTransport(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service() {
        super.service();
        checkEngine();
    }
}

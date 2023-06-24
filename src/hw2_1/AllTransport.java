package hw2_1;

public abstract class AllTransport implements Transport {
    private final String modelName;
    private final int wheelCount;

    public AllTransport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void service() {
        for (int i = 0; i < wheelCount; i++) {
            updateTyre();
        }
    }

}

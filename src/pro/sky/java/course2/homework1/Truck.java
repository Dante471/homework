package pro.sky.java.course2.homework1;

public class Truck extends MechanicalVehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
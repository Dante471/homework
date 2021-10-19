package pro.sky.java.course2.homework1;

public abstract class MechanicalVehicle extends Vehicle {

    public MechanicalVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверям двигатель");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}

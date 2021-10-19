package pro.sky.java.course2.homework1;

public abstract class CargoVehicle extends MechanicalVehicle {

    public CargoVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}

package pro.sky.java.course2.homework1;

public class ServiceStation {

    public void maintenance(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        vehicle.check();
    }

}




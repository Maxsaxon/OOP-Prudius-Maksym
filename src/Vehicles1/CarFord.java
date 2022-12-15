package Vehicles1;

/**
 * Практикум 8
 */
public class CarFord {
    public static void main(String[] args) {
        CarFordClone carfordClone = new CarFordClone();
        CarFordClone carfordClone2 = one(carfordClone);

        carfordClone.setModelName("Mustang");
        carfordClone2.setModelName("Sedan");

        System.out.println(carfordClone.getModelName());
        System.out.println(carfordClone2.getModelName());

    }
    public static CarFordClone one(CarFordClone carfordClone) {

        CarFordClone fordClone = null;
        try {
            fordClone = (CarFordClone)carfordClone.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return fordClone;
    }
}

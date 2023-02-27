public class Car {
    private int carTireCount;
    private int carFuel;

    public Car(int carTireCount, int carFuel) {
        this.carTireCount = carTireCount;
        this.carFuel = carFuel;
    }
    public Car(){
        this.carTireCount = 4;
        this.carFuel = 1;
    }

    public int getCarTireCount() {
        return carTireCount;
    }

    public void setCarTireCount(int carTireCount) {
        this.carTireCount = carTireCount;
    }

    public int getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(int carFuel) {
        this.carFuel = carFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carTireCount=" + carTireCount +
                ", carFuel=" + carFuel +
                '}';
    }
}

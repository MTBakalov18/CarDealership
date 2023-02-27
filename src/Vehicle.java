public class Vehicle {
    private int VIN;
    private String vehicleModel;
    private String vehicleMake;
    private int vehicleHorsePower;
    private int vehiclePrice;

    public Vehicle(){
        this.VIN = 5319;
        this.vehicleModel = "passat";
        this.vehicleMake = "volkswagen";
        this.vehicleHorsePower = 108;
        this.vehiclePrice = 5000;

    }
    public Vehicle(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, int vehiclePrice) {
        this.VIN = VIN;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.vehicleHorsePower = vehicleHorsePower;
        this.vehiclePrice = vehiclePrice;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getVehicleHorsePower() {
        return vehicleHorsePower;
    }

    public void setVehicleHorsePower(int vehicleHorsePower) {
        this.vehicleHorsePower = vehicleHorsePower;
    }

    public int getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(int vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN=" + VIN +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleMake='" + vehicleMake + '\'' +
                ", vehicleHorsePower=" + vehicleHorsePower +
                ", vehiclePrice=" + vehiclePrice +
                '}';
    }
}

import java.util.ArrayList;

public class VehicleDealer {
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Dealer> dealers;

    public VehicleDealer(ArrayList<Vehicle> vehicles, ArrayList<Dealer> dealers) {
        this.vehicles = vehicles;
        this.dealers = dealers;
    }
    public VehicleDealer(){
        this.vehicles = new Vehicle();
        this.dealers = new Dealer();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public ArrayList<Dealer> getDealers() {
        return dealers;
    }

    public void setDealers(ArrayList<Dealer> dealers) {
        this.dealers = dealers;
    }
    public void addElements(Dealer dealer, Vehicle vehicle){
        dealers.add(dealer);
        vehicles.add(vehicle);
    }
    public void returnInfo(ArrayList<VehicleDealer> vehicleDealers) {
        for (VehicleDealer vd : vehicleDealers) {
            System.out.println(vd.toString());
        }

    }

    @Override
    public String toString() {
        return "VehicleDealer{" +
                "vehicles=" + vehicles +
                ", dealers=" + dealers +
                '}';
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        VehicleDealer vehicles = new VehicleDealer();
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add data");
            System.out.println("2. Print data");
            System.out.print("Choose: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    vehicles.addElements();
                    break;
                case 2:
                    vehicles.returnInfo();
                    break;

                default:
                    System.out.println(":(");
            }
        }
    }
}
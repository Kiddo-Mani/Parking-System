package Parking;
import java.util.Scanner;
class Booking extends Vehicle {
    public Booking(String vehNo, String vehCol, String type) {
        super(vehNo, vehCol, type);
    }

    public void details() {
        System.out.println("Vehicle Number: " + getVehNo());
        System.out.println("Vehicle Color: " + getVehCol());
        System.out.println("Vehicle Type: " + getType());
    }

    public void space() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter estimated time of parking (hours): ");
        int time = sc.nextInt();
        int price = 6 * time;
        System.out.println("Total price: $" + price);
    }
}

package Parking;
public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        
        Booking booking1 = new Booking("TN04HU829", "White", "BIKE");
        booking1.details();
        booking1.space();
        parkingLot.displaySlots();
        parkingLot.book(booking1.getType());
        parkingLot.displaySlots();
        
        Booking booking2 = new Booking("TN09HU829", "Red", "CAR");
        booking2.details();
        booking2.space();
        parkingLot.displaySlots();
        parkingLot.book(booking2.getType());
        parkingLot.displaySlots();

        // Cancel booking example
        parkingLot.cancelBooking("BIKE");
        parkingLot.displaySlots();
    }
}

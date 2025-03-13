package Parking;
class ParkingLot {
    private int[][] slots = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

    public void displaySlots() {
        System.out.println("Floor \t Truck Car Bike");
        for (int i = 0; i < slots.length; i++) {
            System.out.print("Floor " + i + "\t ");
            for (int j : slots[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void book(String vehType) {
        int index = getSlotIndex(vehType);
        if (index == -1) {
            System.out.println("Invalid vehicle type!");
            return;
        }

        for (int i = 0; i < slots.length; i++) {
            if (slots[i][index] > 0) {
                slots[i][index]--;
                System.out.println(vehType + " parked on Floor " + i + ", Slot " + index);
                return;
            }
        }
        System.out.println("No space available for " + vehType);
    }

    public void cancelBooking(String vehType) {
        int index = getSlotIndex(vehType);
        if (index == -1) {
            System.out.println("Invalid vehicle type!");
            return;
        }

        for (int i = slots.length - 1; i >= 0; i--) {
            if (slots[i][index] < 2) {
                slots[i][index]++;
                System.out.println(vehType + " booking cancelled from Floor " + i + ", Slot " + index);
                return;
            }
        }
        System.out.println("No bookings found to cancel for " + vehType);
    }

    private int getSlotIndex(String vehType) {
        return switch (vehType.toUpperCase()) {
            case "TRUCK" -> 0;
            case "CAR" -> 1;
            case "BIKE" -> 2;
            default -> -1;
        };
    }
}

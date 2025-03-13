package Parking;
class Vehicle {
    private String vehNo;
    private String vehCol;
    private String type;

    public Vehicle(String vehNo, String vehCol, String type) {
        this.vehNo = vehNo;
        this.vehCol = vehCol;
        this.type = type;
    }

    public String getVehNo() {
        return vehNo;
    }

    public String getVehCol() {
        return vehCol;
    }

    public String getType() {
        return type;
    }
}

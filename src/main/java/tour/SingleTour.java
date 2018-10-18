package tour;

public class SingleTour implements Tour {

    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name,int price,int sit,int reservedSeats){
        this.name = name;
        this.price = price;
        allSeats = sit;
        this.reservedSeats = reservedSeats;

    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableSeats() {

        return allSeats;
    }

    public void setSeat(int checkIn){
        if (allSeats < checkIn){
            System.out.print("Seat is not enough.\n");
        }else {
            allSeats -= checkIn;
        }
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public String checkSearts(){

        if (allSeats == 0){
            if (reservedSeats == 0){
                return "Seat're full now.";
            }else {
                return "Reserved Seats is " + getReservedSeats() + " now.\n";
            }
        }
        return "Available Seats is " + getAvailableSeats() + " now.\n";
    }

}

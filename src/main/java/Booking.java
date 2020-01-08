public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking (Bedroom bedroom, int nights){
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        Bedroom bedroom = this.bedroom;
        return bedroom;
    }


    public int numberOfNights() {
        return this.nights;
    }

    public double totalBill() {
        double totalBill = this.bedroom.getPrice() * this.nights;
        return totalBill;
    }
}

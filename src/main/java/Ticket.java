public class Ticket {

    private int ticketNumber;
    private Passenger passenger;
    private Flight flight;
    private int price;

    public Ticket(int ticketNumber, Passenger passenger, Flight flight, int price){
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passenger.getfName() + " "+ passenger.getlName();
    }

    public String getFlightNumber() {
        return flight.getFlightNumber();
    }

    public int getFlightCapacity(){
        return flight.getCapacity();
    }

    public int getPrice() {
        return price;
    }

    public String getDestination(){
        return flight.getDestination();
    }
}

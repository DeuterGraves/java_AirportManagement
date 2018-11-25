import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicketTest {

    private Passenger passenger;
    private Plane plane;
    private Flight flight;
    private Ticket ticket;

    @Before
    public void before(){
        passenger = new Passenger("Maisie", "Graves");
        plane = new Plane(ModelType.BOEING787, "British Airways", "GH2359P");
        flight = new Flight(plane, "BA-32", "Okinawa");
        ticket = new Ticket(001, passenger, flight, 350);
    }

    @Test
    public void tickettHastTicketNumber(){
        assertEquals(1, ticket.getTicketNumber());
    }

    @Test
    public void ticketHasPassenger(){
        assertEquals("Maisie Graves", ticket.getPassengerName());
    }

    @Test
    public void ticketHasFlightNumber(){
        assertEquals("BA-32", ticket.getFlightNumber());
    }

    @Test
    public void ticketHasPrice(){
        assertEquals(350, ticket.getPrice());
    }

    @Test
    public void ticketHasDestination(){
        assertEquals("Okinawa", ticket.getDestination());
    }

    @Test
    public void ticketHasFlightCapacity(){
        assertEquals(290, ticket.getFlightCapacity());
    }
}

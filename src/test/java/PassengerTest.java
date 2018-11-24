import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

   private Passenger passenger;

   @Before
    public void before(){
       passenger = new Passenger("Jamie", "Graves");
   }

   @Test
    public void passengerHasFName(){
       assertEquals("Jamie", passenger.getfName());
   }

   @Test
    public void passengerHasLName(){
       assertEquals("Graves", passenger.getlName());
   }

   @Test
    public void passengerHasNoTickets(){
       assertEquals(0, passenger.ticketCount());
   }

}

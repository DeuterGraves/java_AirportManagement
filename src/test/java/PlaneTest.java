import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before(){
        plane = new Plane(ModelType.BOEING787, "British Airways", "BA376G");
        passenger1 = new Passenger("Jamie", "Graves");
        passenger2 = new Passenger("Caroline", "Graves");
    }

    @Test
    public void planeHasAModel(){
        assertEquals(ModelType.BOEING787, plane.getModel());
    }

    @Test
    public void planeHasACapacity(){
        assertEquals(290, plane.getCapacityFromEnum());
    }

    @Test
    public void planeHasAnAirline(){
        assertEquals("British Airways", plane.getAirline());
    }

    @Test
    public void planeHasNoPassengers(){
        assertEquals(0, plane.passengerCount());
    }

    @Test
    public void planeCanAddPassengers(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        assertEquals(2, plane.passengerCount());
    }

    @Test
    public void planeUnloadsPassengers(){
        plane.addPassenger(passenger1);
        plane.addPassenger(passenger2);
        plane.removePassengers();
        assertEquals(0, plane.passengerCount());
    }

    @Test
    public void planeHasARegistrationNumber(){
        assertEquals("BA376G", plane.getRegistration());
    }

    //    type & capacity - enum
// airline
//    passengers - arraylist
//    registration number
}

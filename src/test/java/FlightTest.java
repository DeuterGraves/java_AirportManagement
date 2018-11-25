import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Plane plane1;
    private Flight flight;

    @Before
    public void before() {
        plane = new Plane(ModelType.BOEING787, "British Airways", "A568NG");
        plane1 = new Plane(ModelType.ARIBUS380, "British Airways", "GRS349587G");
        flight = new Flight(plane, "BA242", "Honolulu");
    }

    @Test
    public void flightHasAPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasANumber(){
        assertEquals("BA242", flight.getFlightNumber());
    }

    @Test
    public void flightHasADestination(){
        assertEquals("Honolulu", flight.getDestination());
    }

//    this seems redundant... see if you ever use it.
    @Test
    public void flightHasACapacity(){
        assertEquals(290, flight.getCapacity());
    }

    @Test
    public void flightHasNoPassengersOnManifest(){
        assertEquals(0, flight.passengerManifestCount());
    }

    @Test
    public void updatePlaneAssignedToFlight(){
        flight.assignPlane(plane1);
        assertEquals(plane1, flight.getPlane());
    }
    //    plane
//    flight number
//    destination
//    capacity

}

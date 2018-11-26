import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Plane plane;
    private Plane plane1;
    private Hangar hangar;
    private Hangar hangar1;
    private Flight flight;
    private Airport airport;

    @Before
    public void before(){
        plane = new Plane(ModelType.ARIBUS380, "Jamie Airways", "GSSE4562V");
        plane1 = new Plane(ModelType.BOEING787, "Jamie Airways", "DJ763JF");
        hangar = new Hangar(HangarType.A1);
        hangar1 = new Hangar(HangarType.A2);
        flight = new Flight(plane, "JA-54", "Burmuda");
        airport = new Airport("DCA", "NOT Regan National");
    }

    @Test
    public void airportHasAirportCode(){
        assertEquals("DCA", airport.getCode());
    }

    @Test
    public void airportHasNoHangars(){
        assertEquals(0, airport.hangarCount());
    }

    @Test
    public void airportCanAddHangars(){
        airport.addHangar(hangar);
        assertEquals(1, airport.hangarCount());
    }

    @Test
    public void airportHasNoFlights(){
        assertEquals(0, airport.flightCount());
    }

    @Test
    public void airportCanAddFlights(){
        airport.addFlight(flight);
        assertEquals(1, airport.flightCount());
    }

    @Test
    public void airportHasMotto(){
        assertEquals("NOT Regan National", airport.getMotto());
    }

//    this might be a weird duplicated ones.
    @Test
    public void airportCanUpdatePlaneAssignedToFlight(){
        airport.assignPlane(flight, plane1);
        assertEquals(plane1, flight.getPlane());
    }


    @Test
    public void airportCanFindHangarByID(){
        airport.addHangar(hangar);
        airport.addHangar(hangar1);
        assertEquals(hangar1, airport.findHangar(HangarType.A2));
    }

    @Test
    public void airportCanFindPlaneInHangars(){
        airport.addHangar(hangar);
        airport.addHangar(hangar1);
        hangar.park(plane);
        hangar1.park(plane1);
        assertEquals(plane1, airport.findPlane("DJ763JF"));

    }

//    @Test
//    public void airportCanRemovePlaneFromHangar(){
//        airport.addHangar(hangar);
//        hangar.park(plane);
//        hangar.park(plane1);
//        airport.unparkPlane(plane);
//        assertEquals(1, hangar.planeCount());
//    }
//
////    get the hangar from a list of hangars
//    @Test
//    public void airportCanGetHangarFromList(){
//        airport.addHangar(hangar);
//        airport.addHangar(hangar1);
//        assertEquals(hangar1, airport.getHangar(hangar1));
//    }

////    get a plane out of the a hangar to be assigned to a flight
//    @Test
//    public void airportCanAssignPlaneFromHangarToFlight(){
//
//    }
//  sell a ticket for a flight
}

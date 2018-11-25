import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Plane plane;
    private Hangar hangar;
    private Flight flight;
    private Airport airport;

    @Before
    public void before(){
        plane = new Plane(ModelType.BOEING787, "Jamie Airways", "DJ763JF");
        hangar = new Hangar(HangarType.A1);
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
}

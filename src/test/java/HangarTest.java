import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    private Plane plane;
    private Hangar hangar;

    @Before
    public void before(){
        plane = new Plane(ModelType.BOEING787, "British Airways", "RG673B");
        hangar = new Hangar(HangarType.A1);
    }

    @Test
    public void hangarHasNoPlanes(){
        assertEquals(0, hangar.planeCount());
    }

    @Test
    public void hangarHasID(){
        assertEquals(HangarType.A1, hangar.getID());
    }

    @Test
    public void hangarHasCapacity(){
        assertEquals(4, hangar.getCapacityFromEnum());
    }

    @Test
    public void hangarCanAddPlane(){
        hangar.park(plane);
        assertEquals(1, hangar.planeCount());
    }

    @Test
    public void hangarWontAddTooManyPlanes(){
        hangar.park(plane);
        hangar.park(plane);
        hangar.park(plane);
        hangar.park(plane);
        hangar.park(plane);
        assertEquals(4, hangar.planeCount());
    }

//    remove specific plane - by object or index.
}

import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private ArrayList<Passenger> manifest;


    public Flight(Plane plane, String flightNumber, String destination){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.manifest = new ArrayList<>();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }


    public int passengerManifestCount(){
        return manifest.size();
    }

    public int getCapacity(){
        return plane.getCapacityFromEnum();
    }

    public void assignPlane(Plane plane) {
        this.plane = plane;
    }
}

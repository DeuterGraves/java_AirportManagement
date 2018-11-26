import java.util.ArrayList;

public class Airport {

    private String code;
    private String motto;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> flights;

//    since building in theory for 1 specific airport, I am tempted to just hard code in these parameters
    public Airport(String code, String motto){
        this.code = code;
        this.motto = motto;
        this.hangars = new ArrayList<>();
        this.flights = new ArrayList<>();
//        this.hangars.add()
    }

    public String getCode() {
        return code;
    }

    public String getMotto() {
        return motto;
    }

    public int hangarCount(){
        return hangars.size();
    }

    public int flightCount(){
        return flights.size();
    }

    public void addHangar(Hangar hangar){
        hangars.add(hangar);
    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

////    assign plane from hangar to flight.
//    i feel like this is one of the weird duplicated ones
    public void assignPlane(Flight flight, Plane plane){
        flight.assignPlane(plane);
    }

    public Hangar findHangar(HangarType id){
//        for loop
        for (Hangar hangar : hangars) {
            if (hangar.getID() == id) {
                return hangar;
            }
            }
            return null;
    }

// search for the plane within the hangars
//    nested loop until you find the plane
//    find obj then remove obj
//    store the hangar's index and the plane's index and run remove(index OR object)

////    the flaw here is - we're saying 'we have this object now find this object. if we have it - why do we need to find it?  I suppose so we can remove the plane from it... but again, if we have it, then just take the plan from it.
//    public Hangar getHangar(Hangar hangar){
//        if (hangars.contains(hangar)){
//            int index = hangars.indexOf(hangar);
//            return hangars.get(index);
//        }
//    }
//
//    public void unparkPlane(Hangar hangar, Plane plane) {
////        get the hangar from the list of hangars
////        get the plane from the list of planes within the hangar.
//        hangar = hangars.get
//    }


}

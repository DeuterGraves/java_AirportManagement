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
//
//    public void addHangar(HangarType){
//        hangars.add(HangarType);
//    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }
}

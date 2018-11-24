import java.util.ArrayList;

public class Plane {

    private ModelType model;
    private String airline;
    private ArrayList<Passenger> passengers;
    private String registration;

    public Plane(ModelType model, String airline, String registration){
        this.model = model;
        this.airline = airline;
        this.passengers = new ArrayList<>();
        this.registration = registration;
    }

    public ModelType getModel() {
        return model;
    }

    public String getAirline() {
        return airline;
    }

    public String getRegistration() {
        return registration;
    }

    public int getCapacityFromEnum(){
        return model.getCapacity();
    }

    public int passengerCount(){
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void removePassengers(){
        passengers.clear();
    }


    //    type & capacity - enum
// airline
//    passengers - arraylist
//    registration number
}

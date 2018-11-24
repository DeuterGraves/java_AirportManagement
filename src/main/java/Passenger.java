import java.util.ArrayList;

public class Passenger {
    //    first name - string
//    last name - string
//    tickets - array list
    private String fName;
    private String lName;
    private ArrayList<Ticket> tickets;

    public Passenger(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        this.tickets = new ArrayList<>();

    }

    public String getfName() {
        return fName;
    }

//    public void setfName(String fName) {
//        this.fName = fName;
//    }

    public String getlName() {
        return lName;
    }

//    public void setlName(String lName) {
//        this.lName = lName;
//    }

//    public ArrayList<Ticket> getTickets() {
//        return tickets;
//    }

//    public void setTickets(ArrayList<Ticket> tickets) {
//        this.tickets = tickets;
//    }

    public int ticketCount(){
        return tickets.size();
    }
}

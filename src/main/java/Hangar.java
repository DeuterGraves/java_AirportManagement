import java.util.ArrayList;

public class Hangar {

    private HangarType id;
    private ArrayList<Plane> planes;

    public Hangar(HangarType id){
        this.id = id;
        this.planes = new ArrayList<>();
    }

    public HangarType getID() {
        return id;
    }

    public int planeCount(){
        return planes.size();
    }

    public int getCapacityFromEnum(){
        return id.getCapacity();
    }

    public void park(Plane plane){
        if (planeCount() < getCapacityFromEnum()) {
            planes.add(plane);
        }
        return;
    }

}

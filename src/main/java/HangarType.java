public enum HangarType {
    A1(4),
    A2(6);


    private final int capacity;

    HangarType(int capacity){

        this.capacity = capacity;
    }


    public int getCapacity() {
        return capacity;
    }
}


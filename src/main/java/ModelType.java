public enum ModelType {
    BOEING787(290),
    ARIBUS380(555);

    private final int capacity;

    ModelType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}

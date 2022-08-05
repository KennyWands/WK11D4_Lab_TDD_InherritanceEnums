package Rooms;

public enum RoomType {
    SINGLE (1, 75),
    DOUBLE (2, 100),
    TRIPLE (3, 125),
    FAMILY (4, 150),
    CONFERENCE (100, 1000);


    private final int capacity;
    private final int nightlyRate;
    RoomType(int capacity, int nightlyRate) {
        this.capacity = capacity;
        this.nightlyRate = nightlyRate;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public int getNightlyRate() {
        return this.nightlyRate;
    }
}

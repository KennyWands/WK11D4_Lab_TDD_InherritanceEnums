package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> occupants;
    private boolean occupied;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.occupants = new ArrayList<Guest>();
        this.occupied = false;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }

    public int getCapacity(){return this.roomType.getCapacity();}
    public int getNightlyRate() {
        return this.roomType.getNightlyRate();
    }

    ////// Untested
    public void addGuest(Guest guest){
        occupants.add(guest);
        occupied = true;
    }
    public boolean getOccupied(){ return this.occupied;}
}

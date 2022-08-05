package Hotels;

import Guests.Guest;
import Rooms.Bedroom;
import Rooms.ConferenceRoom;
import Rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking> ();

    }


    public String getName(){
        return this.name;
    }
    public void addBedroom(Bedroom room){
        bedrooms.add(room);
    }
    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }
    public String checkIn(){return "guest checked in";}
    public String checkOut(){return "Guest checked out of room";}


    public String bookRoom(Bedroom room, int nights, Guest guest){

    //check rooms available
        Booking booking;
        for( int i =0 ; i< bedrooms.size(); i++){

            if ((bedrooms.get(i).getRoomType() == room.getRoomType()) && (bedrooms.get(i).getOccupied() == false)){
                bedrooms.get(i).addGuest(guest);
                booking = new Booking(bedrooms.get(i), nights);
                bookings.add(booking);
                int totalPrice = bedrooms.get(i).getNightlyRate() * nights;
                return String.format("Booking successful. Total price: %d" , totalPrice);
            }
        }

        return "can not complete booking";
    }


}

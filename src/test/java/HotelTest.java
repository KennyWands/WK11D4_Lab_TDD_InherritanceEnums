import Guests.Guest;
import Hotels.Hotel;
import Rooms.Bedroom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Guest guest1;

    @Before
    public void before() {
        hotel = new Hotel("Hilton");
        bedroom1 = new Bedroom(RoomType.DOUBLE, 1);
        guest1 = new Guest( "James");
    }

    @Test
    public void hotelHasName() {
        assertEquals("Hilton", hotel.getName());
    }

    @Test
    public void canAddBedroomToHotel() {
        hotel.addBedroom(bedroom1);
        assertEquals( 1, )
    }
    @Test
    public void canAddBooking(){
        hotel.addBedroom(bedroom1);
        assertEquals("Booking successful. Total price: 300", hotel.bookRoom(bedroom1, 3, guest1));
    }

}

import Rooms.ConferenceRoom;
import Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Main");
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(100, conferenceRoom.getCapacity());
    }

    @Test
    public void roomHasName() {
        assertEquals("Main", conferenceRoom.getName());
    }
}

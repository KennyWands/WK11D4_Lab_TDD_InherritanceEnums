import Rooms.RoomType;
import Rooms.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 3);
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasRoomNumber() {
        assertEquals(3, bedroom.getNumber());
    }
}

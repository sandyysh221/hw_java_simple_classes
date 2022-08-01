import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void volumeStartsAt100() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void volumeDecreasesBy10WhenDrunk() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void volumeDecreasesBy10WhenDrunk3Times() {
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(70, waterBottle.getVolume());
    }

    @Test
    public void bottleCanBeEmptied() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void bottleCanBeRefilled() {
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}

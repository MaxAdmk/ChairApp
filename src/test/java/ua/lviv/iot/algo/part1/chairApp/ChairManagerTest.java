package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.chairApp.Manager.ChairManager;
import ua.lviv.iot.algo.part1.chairApp.Models.*;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class ChairManagerTest {

    @Test
    void testAddChair() {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair(5, "Joe", "Plastic", 110,
                "Conference Chair", 15));
        chairManager.addChair(new FeedingTable(22, "Eugene", "Plastic", 25,
                120, 80, 80, 2));
        chairManager.addChair(new GamingChair(6, "Boris", "carbon", 150, true,
                false, 40, 10, 15));
        chairManager.addChair(new SwingChair(15,"Josh", "Oak", 170, false,
                30, 0, 5));
        assertEquals(4, chairManager.chairs.size());
    }

    @Test
    void testFindAllMadeWithMaterial(){
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair(5, "Joe", "Plastic", 110,
                "Conference Chair", 15));
        chairManager.addChair(new FeedingTable(22, "Eugene", "Plastic", 25,
                120, 80, 80, 2));
        chairManager.addChair(new GamingChair(6, "Boris", "carbon", 150, true,
                false, 40, 10, 15));
        chairManager.addChair(new SwingChair(15,"Josh", "Oak", 170, false,
                30, 0, 5));
        assertEquals(4, chairManager.chairs.size());
        List<Chair> plasticChairs = chairManager.findAllMadeWithMaterial("Plastic");
        assertEquals(2,plasticChairs.size());
        for (Chair chair : plasticChairs) {
            if (!chair.getMaterial().equals("Plastic")) {
                fail("The chair with ID " + chair.getId() + " has a different material");
            }
        }
        assertEquals(2, plasticChairs.size());

    }

    @Test
    void testFindAllMadeWithMaxWeightGreaterThan() {
        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair(5, "Joe", "Plastic", 110,
                "Conference Chair", 15));
        chairManager.addChair(new FeedingTable(22, "Eugene", "Plastic", 25,
                120, 80, 80, 2));
        chairManager.addChair(new GamingChair(6, "Boris", "carbon", 150, true,
                false, 40, 10, 15));
        chairManager.addChair(new SwingChair(15,"Josh", "Oak", 170, false,
                30, 0, 5));
        List<Chair> strongChairs = chairManager.findAllMadeWithMaxWeightGreaterThan(140);
        assertEquals(2, strongChairs.size());
        for (Chair chair : strongChairs) {
            if (chair.getMaxWeight() < 140) {
                fail("The chair with ID " + chair.getId() + " has the maximum weight that does not suit the parameters");
            }
        }
        assertEquals(2, strongChairs.size());
    }
}
package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class OfficeChairTest {

    @Test
    void adjustingPositionToTwentyShouldChangePositionToTwenty() {
        var officeChair = new OfficeChair();
        officeChair.adjustPosition(20);
        assertEquals(20,officeChair.getChairBackrestAngleInDegrees());
    }

    @Test
    void isOccupiedShouldReturnFalse() {
        var officeChair = new OfficeChair();
        assertFalse(officeChair.isOccupied());
    }

    @Test
    void testRelease() {
        var officeChair = new OfficeChair();
        officeChair.occupy("Stepan");
        officeChair.release();
        assertEquals(null, officeChair.getOwner());
    }

    @Test
    void testOccupy() {
        var officeChair = new OfficeChair();
        officeChair.occupy("Eugene");
        assertEquals("Eugene", officeChair.getOwner());
        officeChair.occupy("Bogdan");
        assertEquals("Eugene", officeChair.getOwner());
    }

    @Test
    void testToString(){
        var officeChair = new OfficeChair( 12, "Oleg", "Oak",
                100, "Conference Chair", 15);
        String expectedText = "OfficeChair(super=Chair id: 12, material: Oak, max weight: 100, owner: Oleg, type=Conference Chair, chairBackrestAngleInDegrees=15)";
        String actualText = officeChair.toString();
        assertEquals(expectedText, actualText);
    }

}
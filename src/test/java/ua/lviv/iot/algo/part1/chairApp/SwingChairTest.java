package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.chairApp.Models.SwingChair;

import static org.junit.jupiter.api.Assertions.*;
class SwingChairTest {

    @Test
    public void testAdjustPositionWithinRange() {
        SwingChair swingChair = new SwingChair();
        swingChair.setMaxMotionAngleInDegrees(30);
        swingChair.setMinMotionAngleInDegrees(0);
        swingChair.adjustPosition(15);
        assertEquals(15, swingChair.getCurrentMotionAngleInDegrees());
        swingChair.adjustPosition(100);
        assertEquals(15, swingChair.getCurrentMotionAngleInDegrees());
    }

    @Test
    public void testAdjustPositionOutOfRange() {
        SwingChair swingChair = new SwingChair(false, 40, 0, 15);
        swingChair.adjustPosition(100);
        assertEquals(15, swingChair.getCurrentMotionAngleInDegrees());
    }

    @Test
    public void testAdjustPositionZeroMaxMinMotionAngle() {
        SwingChair swingChair = new SwingChair(false, 0, 0, 0);
        swingChair.adjustPosition(15);
        assertEquals(0, swingChair.getCurrentMotionAngleInDegrees());
    }

    @Test
    public void testSwingChairVariables() {
        var swingChair = new SwingChair();
        swingChair.setMinMotionAngleInDegrees(0);
        assertEquals(0, swingChair.getMinMotionAngleInDegrees());
        swingChair.setMaxMotionAngleInDegrees(30);
        assertEquals(30, swingChair.getMaxMotionAngleInDegrees());
        swingChair.setHasCanopy(true);
        assertTrue(swingChair.isHasCanopy());
    }

}
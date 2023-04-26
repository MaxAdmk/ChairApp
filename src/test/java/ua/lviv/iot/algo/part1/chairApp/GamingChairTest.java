package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.chairApp.Models.GamingChair;

import static org.junit.jupiter.api.Assertions.*;
class GamingChairTest {

    @Test
    void testAdjustPositionToThirtyFiveShouldReturnZero() {
        var gamingChair = new GamingChair();
        gamingChair.adjustPosition(35);
        assertEquals(0, gamingChair.getCurrentHeightOfArmrestsInCm());
    }

    @Test
    void testAdjustPositionToTwentyShouldReturnTwenty() {
        var gamingChair = new GamingChair();
        gamingChair.setMinHeightOfArmrestsInCm(10);
        gamingChair.setMaxHeightOfArmrestsInCm(40);
        gamingChair.adjustPosition(20);
        assertEquals(20, gamingChair.getCurrentHeightOfArmrestsInCm());
    }

    @Test
    void testGamingChairVariables() {
        var gamingChair = new GamingChair();
        gamingChair.setHasCoolingSystem(true);
        gamingChair.setHasIlluminatedLogo(false);
        assertTrue(gamingChair.isHasCoolingSystem());
        assertFalse(gamingChair.isHasIlluminatedLogo());
        gamingChair.setMaxHeightOfArmrestsInCm(15);
        assertEquals(15, gamingChair.getMaxHeightOfArmrestsInCm());
        gamingChair.setMinHeightOfArmrestsInCm(10);
        assertEquals(10, gamingChair.getMinHeightOfArmrestsInCm());
    }

}
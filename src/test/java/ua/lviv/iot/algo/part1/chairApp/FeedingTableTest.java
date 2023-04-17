package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FeedingTableTest {

    @Test
    void adjustPositionToTenShouldReturnTen() {
        var feedingTable = new FeedingTable();
        feedingTable.setMaxHeightInCm(100);
        feedingTable.setMinHeightInCm(10);
        feedingTable.setCurrentHeightInCm(15);
        feedingTable.adjustPosition(10);
        assertEquals(10, feedingTable.getCurrentHeightInCm());
    }

    @Test
    void adjustPositionToTenShouldReturnZero() {
        var feedingTable = new FeedingTable();
        feedingTable.adjustPosition(10);
        assertEquals(0, feedingTable.getCurrentHeightInCm());
    }

    @Test
    void adjustPositionToFiveShouldReturnZero() {
        var feedingTable = new FeedingTable();
        feedingTable.setMinHeightInCm(40);
        feedingTable.setMaxHeightInCm(100);
        feedingTable.adjustPosition(5);
        assertEquals(0, feedingTable.getCurrentHeightInCm());
    }

    @Test
    void testFeedingTableVariables() {
        var feedingTable = new FeedingTable();
        feedingTable.setMinHeightInCm(30);
        assertEquals(30, feedingTable.getMinHeightInCm());
        feedingTable.setMaxHeightInCm(100);
        assertEquals(100, feedingTable.getMaxHeightInCm());
        feedingTable.setChildAge(3);
        assertEquals(3, feedingTable.getChildAge());
    }

}
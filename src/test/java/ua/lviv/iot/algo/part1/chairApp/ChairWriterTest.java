package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.chairApp.Models.Chair;
import ua.lviv.iot.algo.part1.chairApp.Models.GamingChair;
import ua.lviv.iot.algo.part1.chairApp.Models.OfficeChair;
import ua.lviv.iot.algo.part1.chairApp.Writer.ChairWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class ChairWriterTest {

    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private ChairWriter writer;

    @BeforeEach
    public void setUp() {
        writer = new ChairWriter();
    }

    @AfterAll
    public static void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testWriteEmptyList() throws IOException {
        List<Chair> chairs = new ArrayList<>();
        writer.writeToFile(chairs);
        File file = new File(RESULT_FILENAME);
        assertFalse(file.exists());
    }

    @Test
    public void testWriteListOfChairs() throws IOException {
        List<Chair> chairs = new ArrayList<>();
        chairs.add(new GamingChair(12, "Joseph", "wood", 120, false, true, 40, 20, 30));
        chairs.add(new OfficeChair(32, "Max", "wood", 120, "talking", 15));
        writer.writeToFile(chairs);
        assertEquals( -1,Files.mismatch(Path.of(EXPECTED_FILENAME), Path.of(RESULT_FILENAME)));
    }

    @Test
    public void testFileOverride() throws IOException{
        List<Chair> fakeChairs = new ArrayList<>();
        fakeChairs.add(new OfficeChair(14, "Jake", "plastic", 200, "Studying",30));
        writer.writeToFile(fakeChairs);
        List<Chair> chairs = new ArrayList<>();
        chairs.add(new GamingChair(12, "Joseph", "wood", 120, false, true, 40, 20, 30));
        chairs.add(new OfficeChair(32, "Max", "wood", 120, "talking", 15));
        writer.writeToFile(chairs);
        assertEquals( -1,Files.mismatch(Path.of(EXPECTED_FILENAME), Path.of(RESULT_FILENAME)));
    }
}
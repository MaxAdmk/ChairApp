package ua.lviv.iot.algo.part1.chairApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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
    public void setUp() throws IOException{
        writer = new ChairWriter();
    }

    @Test
    public void testEmptyWrite() throws IOException {
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
        Path expected = new File(EXPECTED_FILENAME).toPath();
        assertEquals( -1,Files.mismatch(Path.of(EXPECTED_FILENAME), Path.of(RESULT_FILENAME)));
    }

    @Disabled
    @Test
    public void testFileOverride() throws IOException{
        List<Chair> chairs = new ArrayList<>();
        chairs.add(new GamingChair(12, "Joseph", "wood", 120, false, true, 40, 20, 30));
        chairs.add(new OfficeChair(32, "Max", "wood", 120, "talking", 15));
        writer.writeToFile(chairs);
        assertEquals( -1,Files.mismatch(Path.of(EXPECTED_FILENAME), Path.of(RESULT_FILENAME)));
    }
}
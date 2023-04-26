package ua.lviv.iot.algo.part1.chairApp.Writer;

import ua.lviv.iot.algo.part1.chairApp.Models.Chair;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ChairWriter {
    private static final String FILENAME = "result.csv";

    public String writeToFile(List<Chair> chairs) throws IOException {
        if (new File(FILENAME).exists()) {
            Files.delete(Path.of(FILENAME));
        }

        if (chairs == null || chairs.isEmpty()) {
            return null;
        }

        String defaultFileName = FILENAME;
        try (FileWriter writer = new FileWriter(defaultFileName)) {
            for (var chair : chairs){
                writer.write(chair.getHeaders());
                writer.write("\r\n");
                writer.write(chair.toCSV());
                writer.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultFileName;
    }
}



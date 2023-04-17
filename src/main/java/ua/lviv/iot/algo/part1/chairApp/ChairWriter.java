package ua.lviv.iot.algo.part1.chairApp;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ChairWriter {
    public String writeToFile(List<Chair> chairs) throws IOException {
        if (new File("result.csv").exists()) {
            Files.delete(Path.of("result.csv"));
        }

        if (chairs == null || chairs.isEmpty()) {
            return null;
        }

        String defaultFileName = "result.csv";
        try (FileWriter writer = new FileWriter(defaultFileName)) {
            for (var chair : chairs){
                writer.write(chair.getHeaders());
                writer.write("\r\n");
                writer.write(chair.toCSV());
                writer.write("\r\n");
            }
        } catch (IOException e) {

        }
        return defaultFileName;
    }
}



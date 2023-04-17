package ua.lviv.iot.algo.part1.chairApp;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class ChairManager {

    List<Chair> chairs = new ArrayList<>();

    public void addChair(final Chair chair){
        this.chairs.add(chair);
    }

    public List<Chair> findAllMadeWithMaterial(String material){
        return chairs.stream().filter(chair -> chair.getMaterial() == material).toList();
    }

    public List<Chair> findAllMadeWithMaxWeightGreaterThan(int maxWeight){
        return chairs.stream().filter(chair -> chair.getMaxWeight() > maxWeight ).toList();
    }

    public static void main(String[] args) throws IOException {
        List<Chair> chairs = new ArrayList<>();
        chairs.add(new GamingChair(12, "Joseph", "wood", 120, false, true, 40, 20, 30));
        chairs.add(new OfficeChair(32, "Max", "wood", 120, "talking", 15));
        ChairWriter writer = new ChairWriter();
        writer.writeToFile(chairs);
    }
}

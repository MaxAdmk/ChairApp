package ua.lviv.iot.algo.part1.chairApp;
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

    public static void main (String[] args){

        List<Chair> chairs = new ArrayList<>();

        ChairManager chairManager = new ChairManager();
        chairManager.addChair(new OfficeChair(5, "Joe", "Plastic", 110,"Conference Chair", 15));
        chairManager.addChair(new FeedingTable(22, "Eugene", "Plastic", 25,
                120, 80, 80, 2));
        chairManager.addChair(new GamingChair(6, "Boris", "carbon", 150, true, false,
                40, 10, 15));
        chairManager.addChair(new SwingChair(15,"Josh", "Oak", 170, false, 30, 0, 5));

        for (Chair info: chairs) System.out.println(info);

        var foundChairsByMaterial = chairManager.findAllMadeWithMaterial("Plastic");
        for(Chair chair: foundChairsByMaterial){
            System.out.println(chair);
        }

        System.out.println("\t");

        var foundChairsByMaxWeight = chairManager.findAllMadeWithMaxWeightGreaterThan(100);
        for(Chair chair: foundChairsByMaxWeight){
            System.out.println(chair);
        }
    }
}

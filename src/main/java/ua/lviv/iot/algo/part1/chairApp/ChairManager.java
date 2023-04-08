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


}

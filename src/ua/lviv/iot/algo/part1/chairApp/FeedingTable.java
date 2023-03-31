package ua.lviv.iot.algo.part1.chairApp;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FeedingTable extends Chair{

    public int minHeightCm;
    public int maxHeightCm;
    public int currentHeightCm;
    int childAge;

    public FeedingTable(int id, String owner, String material, int maxWeight, int maxHeightInCm,
                        int minHeightInCm, int currentHeightInCm, int childAge){
        this.id = id;
        this.owner = owner;
        this.material = material;
        this.maxWeight = maxWeight;
        this.maxHeightCm = maxHeightInCm;
        this.minHeightCm = minHeightInCm;
        this.currentHeightCm = currentHeightInCm;
        this.childAge = childAge;
    }

    public void adjustPosition(int value){
        if (value > maxHeightCm || value < minHeightCm){
            System.out.println("The value does not correspond to the characteristics of the chair");
        } else {
        currentHeightCm = value;
        }
    }

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner +", max height: " + maxHeightCm +", min height: "
                + minHeightCm +", current height: "
                + currentHeightCm +", child age: " +childAge;
    }

}

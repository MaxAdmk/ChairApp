package ua.lviv.iot.algo.part1.chairApp;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FeedingTable extends Chair{

    public int minHeightInCm;
    public int maxHeightInCm;
    public int currentHeightInCm;
    int childAge;

    public FeedingTable(int id, String owner, String material, int maxWeight, int maxHeightInCm,
                        int minHeightInCm, int currentHeightInCm, int childAge){
        this.id = id;
        this.owner = owner;
        this.material = material;
        this.maxWeight = maxWeight;
        this.maxHeightInCm = maxHeightInCm;
        this.minHeightInCm = minHeightInCm;
        this.currentHeightInCm = currentHeightInCm;
        this.childAge = childAge;
    }

    public void adjustPosition(int value){
        if (value > maxHeightInCm || value < minHeightInCm){
            System.out.println("The value does not correspond to the characteristics of the chair");
        } else {
        currentHeightInCm = value;
        }
    }

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner +", max height: " + maxHeightInCm +", min height: "
                + minHeightInCm +", current height: "
                + currentHeightInCm +", child age: " +childAge;
    }

}

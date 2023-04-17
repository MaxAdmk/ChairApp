package ua.lviv.iot.algo.part1.chairApp;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class FeedingTable extends Chair{

    private int minHeightInCm;
    private int maxHeightInCm;
    private int currentHeightInCm;
    private int childAge;

    public FeedingTable(int id, String owner, String material, int maxWeight, int maxHeightInCm,
                        int minHeightInCm, int currentHeightInCm, int childAge){
        super(material, maxWeight, id, owner);
        this.maxHeightInCm = maxHeightInCm;
        this.minHeightInCm = minHeightInCm;
        this.currentHeightInCm = currentHeightInCm;
        this.childAge = childAge;
    }

    public void adjustPosition(int value){
        if (value > maxHeightInCm || value < minHeightInCm){
            System.out.println("The value does not correspond to the characteristics of the chair");
        } else if (maxHeightInCm == 0 && minHeightInCm == 0) {
            System.out.println("You should change max height and min height");
        } else {
        currentHeightInCm = value;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "minHeightInCm" + "," + "maxHeightInCm"
                + "," + "currentHeightInCm" + "," + "childAge";
    }

    public String toCSV() {
        return super.toCSV() + "," + maxHeightInCm + "," +maxHeightInCm + "," + currentHeightInCm + "," + childAge;
    }

}

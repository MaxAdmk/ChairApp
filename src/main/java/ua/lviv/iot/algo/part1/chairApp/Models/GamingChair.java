package ua.lviv.iot.algo.part1.chairApp.Models;

import lombok.*;
import ua.lviv.iot.algo.part1.chairApp.Models.Chair;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class GamingChair extends Chair {

    private boolean hasCoolingSystem;
    private boolean hasIlluminatedLogo;
    private int maxHeightOfArmrestsInCm;
    private int minHeightOfArmrestsInCm;
    private int currentHeightOfArmrestsInCm;

    public GamingChair(int id, String owner, String material, int maxWeight,
                       boolean hasCoolingSystem, boolean hasIlluminatedLogo, int maxHeightOfArmrestsInCm,
                       int minHeightOfArmrestsInCm, int currentHeightOfArmrestsInCm) {
        super(material, maxWeight, id, owner);
        this.hasCoolingSystem = hasCoolingSystem;
        this.hasIlluminatedLogo = hasIlluminatedLogo;
        this.maxHeightOfArmrestsInCm = maxHeightOfArmrestsInCm;
        this.minHeightOfArmrestsInCm = minHeightOfArmrestsInCm;
        this.currentHeightOfArmrestsInCm = currentHeightOfArmrestsInCm;

    }

    public void adjustPosition(int value){
        if (value > maxHeightOfArmrestsInCm || value < minHeightOfArmrestsInCm){
            System.out.println("The value does not correspond to the characteristics of the chair");
        } else {
            currentHeightOfArmrestsInCm = value;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + "," +"hasCoolingSystem" + "," + "hasIlluminatedLogo"
                + "," + "maxHeightOfArmrestsInCm" + "," + "minHeightOfArmrestsInCm"
                + "," + "currentHeightOfArmrestsInCm";
    }

    public String toCSV() {
        return super.toCSV() + "," + hasCoolingSystem + "," + hasIlluminatedLogo + ","
                + maxHeightOfArmrestsInCm + "," + minHeightOfArmrestsInCm + ","
                + currentHeightOfArmrestsInCm;
    }

}

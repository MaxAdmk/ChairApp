package ua.lviv.iot.algo.part1.chairApp.Models;

import lombok.*;
import ua.lviv.iot.algo.part1.chairApp.Models.Chair;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class SwingChair extends Chair {

    private boolean hasCanopy;
    private int maxMotionAngleInDegrees;
    private int minMotionAngleInDegrees;
    private int currentMotionAngleInDegrees;

    public SwingChair(int id, String owner, String material, int maxWeight, boolean hasCanopy, int maxMotionAngleInDegrees, int minMotionAngleInDegrees, int currentMotionAngleInDegrees) {
        super(material, maxWeight, id, owner);
        this.hasCanopy = hasCanopy;
        this.maxMotionAngleInDegrees = maxMotionAngleInDegrees;
        this.minMotionAngleInDegrees = minMotionAngleInDegrees;
        this.currentMotionAngleInDegrees = currentMotionAngleInDegrees;
    }

    public void adjustPosition(int value){
        if (value > maxMotionAngleInDegrees || value < minMotionAngleInDegrees){
            System.out.println("The value does not correspond to the characteristics of the chair");
        } else if (maxMotionAngleInDegrees == 0 && minMotionAngleInDegrees == 0) {
            System.out.println("You should change max motion angle and min motion angle");
        } else {
            currentMotionAngleInDegrees = value;
        }
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "hasCanopy" + "," + "maxMotionAngleInDegrees"
                + "," + "minMotionAngleInDegrees" + "," + "currentMotionAngleInDegrees";
    }

    public String toCSV() {
        return super.toCSV() + "," + hasCanopy + "," + maxMotionAngleInDegrees + ","
                + minMotionAngleInDegrees + "," + currentMotionAngleInDegrees;
    }

}

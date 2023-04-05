package ua.lviv.iot.algo.part1.chairApp;

import lombok.*;
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
        } else {
            currentMotionAngleInDegrees = value;
        }
    }
}

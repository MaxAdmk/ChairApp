package ua.lviv.iot.algo.part1.chairApp;

public class SwingChair extends Chair {

    public boolean hasCanopy;
    public int maxMotionAngleInDegrees;
    public int minMotionAngleInDegrees;
    public int currentMotionAngleInDegrees;

    public SwingChair(int id, String owner, String material, int maxWeight, boolean hasCanopy, int maxMotionAngleInDegrees, int minMotionAngleInDegrees, int currentMotionAngleInDegrees) {
        this.id = id;
        this.owner = owner;
        this.material = material;
        this.maxWeight = maxWeight;
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

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner +", has canopy: " +hasCanopy +", max motion angle: " + maxMotionAngleInDegrees +", min motion angle: "
                + minMotionAngleInDegrees +", current motion angle: " + currentMotionAngleInDegrees;
    }
}

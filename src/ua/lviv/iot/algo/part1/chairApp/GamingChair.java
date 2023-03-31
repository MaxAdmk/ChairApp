package ua.lviv.iot.algo.part1.chairApp;

public class GamingChair extends Chair{

    public boolean hasCoolingSystem;
    public boolean hasIlluminatedLogo;
    public int maxHeightOfArmrestsInCm;
    public int minHeightOfArmrestsInCm;
    public int currentHeightOfArmrestsInCm;

    public GamingChair(int id, String owner, String material, int maxWeight,
                       boolean hasCoolingSystem, boolean hasIlluminatedLogo, int maxHeightOfArmrestsInCm,
                       int minHeightOfArmrestsInCm, int currentHeightOfArmrestsInCm) {
        this.id = id;
        this.owner = owner;
        this.material = material;
        this.maxWeight = maxWeight;
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

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner +", has cooling systems: " +hasCoolingSystem +", has illuminated logo: " +hasIlluminatedLogo
                +", max height of armrests: " + maxHeightOfArmrestsInCm +", min height of armrests: " + minHeightOfArmrestsInCm +", current height of armrests: "
                + currentHeightOfArmrestsInCm;
    }

}

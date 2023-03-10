package ua.lviv.iot.algo.part1.chairApp;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chair {

    private String material;
    private int maxWeight;
    private int id = 1;
    private String owner;
    private static Chair instance = new Chair();

    public void occupy(String owner) {
        this.owner = owner;
    }

    public void release() {
        this.owner = null;
    }

    public boolean isOccupied() {
        if (this.owner != null) {
            return true;
        } else {
            return false;
        }
    }

    public static Chair getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner;
    }

    public static void main(String[] args) {
        Chair officeChair = new Chair("Oak", 100, 48, "Pedro");
        officeChair.occupy("Vasyl");
        System.out.println(officeChair.isOccupied());
        officeChair.release();
        System.out.println(officeChair.isOccupied());

        Chair[] chairs = new Chair[4];
        chairs[0] = Chair.getInstance();
        chairs[1] = new Chair();
        chairs[2] = new Chair("Birch", 95, 30, "Maksym");
        chairs[3] = Chair.getInstance();

        for (int i=0; i < chairs.length; i++) {
            System.out.println("Chair id:" + chairs[i].getId());
        }

        System.out.println(officeChair.toString());

    }
}

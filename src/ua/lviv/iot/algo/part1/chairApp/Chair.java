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
        if(this.owner == null) {
            this.owner = owner;
        } else {
            System.out.println("This chair is occupied");
        }
    }

    public void release() {
        this.owner = null;
    }

    public boolean isOccupied() {
        return this.owner != null;
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

        Chair[] chairs = {
        Chair.getInstance(),
        new Chair(),
        new Chair("Birch", 95, 30, "Maksym"),
        Chair.getInstance()};

        for (Chair info: chairs) System.out.println(info);

    }
}

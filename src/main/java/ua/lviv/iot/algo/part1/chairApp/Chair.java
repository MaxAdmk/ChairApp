package ua.lviv.iot.algo.part1.chairApp;
import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Chair {

    private String material;
    private int maxWeight;
    private int id = 1;
    private String owner;

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

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner;
    }

    public void adjustPosition(int value){}

}

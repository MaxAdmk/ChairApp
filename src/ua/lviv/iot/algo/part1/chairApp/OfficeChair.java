package ua.lviv.iot.algo.part1.chairApp;

import lombok.*;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OfficeChair extends Chair{

    public String type;
    public int chairBackrestAngleInDegrees;

    public OfficeChair(int id, String owner, String material, int maxWeight, String type, int chairBackrestAngleInDegrees) {
        this.id = id;
        this.owner = owner;
        this.material = material;
        this.maxWeight = maxWeight;
        this.type = type;
        this.chairBackrestAngleInDegrees = chairBackrestAngleInDegrees;
    }

    public void adjustPosition(int value) {
        chairBackrestAngleInDegrees = value;
    }

    @Override
    public String toString() {
        return "Chair id: " +id +", material: " +material +", max weight: "
                +maxWeight +", owner: " +owner +", type: " +type +", chair backrest angle: " +chairBackrestAngleInDegrees;
    }
}

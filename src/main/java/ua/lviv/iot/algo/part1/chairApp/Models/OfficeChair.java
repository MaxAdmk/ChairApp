package ua.lviv.iot.algo.part1.chairApp.Models;

import lombok.*;
import ua.lviv.iot.algo.part1.chairApp.Models.Chair;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class OfficeChair extends Chair {

    private String type;
    private int chairBackrestAngleInDegrees;

    public OfficeChair(int id, String owner, String material, int maxWeight, String type, int chairBackrestAngleInDegrees) {
        super(material, maxWeight, id, owner);
        this.type = type;
        this.chairBackrestAngleInDegrees = chairBackrestAngleInDegrees;
    }

    public void adjustPosition(int value) {
        chairBackrestAngleInDegrees = value;
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "type" + "," + "chairBackrestAngleInDegrees";
    }

    public String toCSV() {
        return super.toCSV() + "," + type + "," + chairBackrestAngleInDegrees;
    }

}

package enum_23;

/**
 * Created by Daniel_D'AGE on 05.11.2018.
 */
public enum Cars {

    VOLVO_V50(2007, 5, "diesel", "black pearl"),
    RENAULT_TALISMAN(2016, 4, "petrol", "blue"),
    AUDI_A8(2008, 4, "diesel", "silver"),
    VW_PASSAT(2009, 4, "petrol", "green"),
    HONDA_ACCORD(2013, 4, "petrol", "black"),
    TOYOTA_PRIUS(2017, 3, "hybrid", "white");

    private int year;
    private int doors;
    private String drive;
    private String color;

    Cars(int year, int doors, String drive, String color) {
        this.year = year;
        this.doors = doors;
        this.drive = drive;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " year: " + year + ", doors: " + doors + ", drive: " + drive + ", color: " + color;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public String getDrive() {
        return drive;
    }

    public String getColor() {
        return color;
    }
}

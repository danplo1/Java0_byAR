package enum_23;

/**
 * Created by Daniel_D'AGE on 05.11.2018.
 */
public enum Cars {

    VOLVO_V50 (2007, 5, "diesel"),
    RENAULT_TALISMAN(2016, 4, "petrol"),
    AUDI_A8 (2008, 4, "diesel"),
    VW_PASSAT(2009, 4, "petrol"),
    HONDA_ACCORD (2013, 4, "petrol"),
    TOYOTA_PRIUS (2015, 3, "hybrid");

    private int year;
    private int doors;
    private String drive;

    Cars(int year, int doors, String drive) {
        this.year = year;
        this.doors = doors;
        this.drive = drive;
    }

    @Override
    public String toString() {
        return super.toString() + " year: " + year + ", doors: " + doors + ", drive: " + drive;
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
}

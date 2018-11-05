package enum_23;

/**
 * Created by Daniel_D'AGE on 05.11.2018.
 */
public class Car {

    private int year;
    private int doors;
    private String drive;
    private String color;

    public Car(int year, int doors, String drive, String color) {
        this.year = year;
        this.doors = doors;
        this.drive = drive;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

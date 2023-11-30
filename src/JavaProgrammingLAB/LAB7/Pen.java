package JavaProgrammingLAB.LAB7;

/*
|----------------------------------|
|DATE: week 11 | 2023 Nov 9 | LAB 7|
|----------------------------------|
*/

public class Pen {
    private int id;
    private String color;
    public Pen() {
        id = 0;
        color = "";
    }
    public Pen(int id, String color) {
        this.id = id;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

}

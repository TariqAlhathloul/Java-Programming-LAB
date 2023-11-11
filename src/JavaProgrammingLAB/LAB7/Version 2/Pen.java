package org.example;

public class Pen {
    private int id;
    private String color;

    public Pen() {
        id = 0;
        color = "";
    }

    public Pen(int i, String c) {
        this.id = i;
        this.color = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public void print() {
        System.out.printf("%s%d\t%s%s%n", "ID: ", id, "Color: ", color);
    }
}

class PenTester {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.print();
        p2.print();
        Pen p3 = new Pen(101, "red");
        p3.setId(102);
        System.out.println(p3.getId());
    }
}
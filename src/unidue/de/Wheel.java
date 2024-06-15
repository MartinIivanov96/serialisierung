package unidue.de;

import java.io.Serializable;

public class Wheel implements Serializable {
    private static final long serialVersionUID = 1L;
    private int diameter;

    public Wheel() {    }
    Wheel(int diam) {
        this.diameter = diam;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}

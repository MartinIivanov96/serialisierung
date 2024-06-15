package unidue.de;

import java.io.Serializable;

public class Piston implements Serializable {
    private static final long serialVersionUID = 1L;
    private double thickness;

    public Piston() {    }
    public Piston(double thickness){
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
}

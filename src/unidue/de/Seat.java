package unidue.de;

import java.io.Serializable;

public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    private Color color;

    public Seat() {    }
    public Seat(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

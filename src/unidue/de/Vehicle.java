package unidue.de;

import java.io.Serializable;

abstract class Vehicle implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package unidue.de;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Engine implements Serializable {
    private static final long serialVersionUID = 1L;
    private double size;
    private List<Piston> pistons;

    public Engine() {    }
    public Engine(double size){
        this.size = size;
        this.pistons = new ArrayList<>();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void addPiston(Piston piston){
        pistons.add(piston);
    }

    public List<Piston> getPistons() {
        return this.pistons;
    }

    public void setPistons(List<Piston> pistons) {
        this.pistons = pistons;
    }

}

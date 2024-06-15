package unidue.de;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle{
    private static final long serialVersionUID = 1L;
    private String model;
    private Engine engine;
    private List<Seat> seats;
    private List<Wheel> wheels;

    Car(int id, String model, Engine engine){
        this.setId(id);
        this.model = model;
        this.engine = engine;
        this.seats = new ArrayList<>();
        this.wheels = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void addWheel(Wheel wheel) {
        wheels.add(wheel);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }


}

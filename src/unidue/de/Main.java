package unidue.de;

import java.io.*;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

public class Main {

    public static void main(String[] args) {
        // Create objects
        Engine engine = new Engine(5.0);
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        engine.addPiston(new Piston(12.2));
        Car car = new Car(1, "BMW M5 V10", engine);
        car.addWheel(new Wheel(19));
        car.addWheel(new Wheel(19));
        car.addWheel(new Wheel(19));
        car.addWheel(new Wheel(19));

        Seat seat1 = new Seat(Color.BLACK);
        Seat seat2 = new Seat(Color.BLACK);
        car.addSeat(seat1);
        car.addSeat(seat2);

        // Serialization of Engine
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("engine.ser"))){
            oos.writeObject(car.getEngine());
            System.out.println("Engine has been serialized");
        } catch (IOException e){
            e.printStackTrace();
        }

        // Serialization of the car
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            oos.writeObject(car);
            System.out.println("Car has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization of the engine
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("engine.ser"))) {
            Engine deserializedEngine = (Engine) ois.readObject();
            System.out.println("Engine has beed deserialized");
            System.out.println("Engine size : "+deserializedEngine.getSize());
            System.out.println("PNumber of Pistons: "+deserializedEngine.getPistons().size());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Deserialization of the car
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println("Car has been deserialized");
            System.out.println("Model: " + deserializedCar.getModel());
            System.out.println("Wheels: " + deserializedCar.getWheels().size());
            System.out.println("Seats: " + deserializedCar.getSeats().size());
            System.out.println("Engine size: " + deserializedCar.getEngine().getSize());
            System.out.println("Pistons: " + deserializedCar.getEngine().getPistons().size());

        } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
        }



        //XML Serialization



                //engine serialization
        try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("engine.xml")))){
            encoder.writeObject(engine);
            System.out.println("Engine serialized to XML");
        } catch (IOException e) {
            e.printStackTrace();
        }
                //car serialization
        try (XMLEncoder encoder2 = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("car.xml")))){
            encoder2.writeObject(car);
            System.out.println("Car serialized to XML");
        } catch (IOException e) {
            e.printStackTrace();
        }
    //XML Deserialization

                    //Engine deserialization
        try(XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("engine.xml")))){
            Engine deserializedEngine = (Engine) decoder.readObject();
            System.out.println("Engine deserialized!");
            System.out.println("Engine size : " + deserializedEngine.getSize());
            System.out.println("Pistons number : " + deserializedEngine.getPistons().size());
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

                    //Car deserialization
        try(XMLDecoder decoder2 = new XMLDecoder(new BufferedInputStream(new FileInputStream("car.xml")))){
            Car deserializedCar = (Car) decoder2.readObject();
            System.out.println("Car deserialized!");
            System.out.println("Car model : " + deserializedCar.getModel());
            System.out.println("Wheels: " + deserializedCar.getWheels().size());
            System.out.println("Seats: " + deserializedCar.getSeats().size());
            System.out.println("Engine size: " + deserializedCar.getEngine().getSize());
            System.out.println("Pistons: " + deserializedCar.getEngine().getPistons().size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

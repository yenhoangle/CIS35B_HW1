/*
* Yen Le
* 20123455
*
* Driver.java
* Driver class to test building Automotive object from file as well as serialization and deserialization
* File tested were:
* ffw.txt, which contains options for a Ford Focus Wagon ZTW
* ffrs.txt, which contains options for a Ford Focus RS
* es.txt, which contains options for an Electric Scooter 3000
*
* Sample outputs are included in a file called output.txt
* */
package driver;
import util.FileIO;
import model.Automotive;


public class Driver {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Arteh\\IdeaProjects\\CIS35B_HW1\\ffw.txt";
        String ser = "C:\\Users\\Arteh\\IdeaProjects\\CIS35B_HW1\\ffw.ser";

        FileIO fileIO = new FileIO();
        Automotive car = fileIO.buildAutoObject(filename);
        System.out.println("Car attributes before serialization:\n");
        car.print();
        fileIO.serialize(ser, car);
        Automotive newCar = fileIO.deserialize(ser);
        System.out.println();
        System.out.println("Car attributes after serialization and deserialization:\n");
        newCar.print();

    }
}

/**
 * Created by dominicmassimo on 4/19/17.
 */
public class Car {
    String color;
    int horsepower;
    String make;
    double engineSize;

    //Default Constructor
    public Car() {
        this.make = "Honda";
        this.color = "Black";
        this.horsepower =475;
        this.engineSize = 3.7;
    }

    //Custom Constructor
    public Car(String color, String make, int horsepower, double engineSize) {
        this.color = color;
        this.make = make;
        this.horsepower = horsepower;
        this.engineSize = engineSize;
    }


    public String getMake() { return make; }

    public void setMake(String newMake) {
        this.make = newMake;
    }


    public String getColor() { return color; }


    public void setColor(String newColor) {
        this.color = newColor;
    }


    public int getHorsepower() { return horsepower; }


    public void setHorsepower(int newHorsepower) {
        this.horsepower = newHorsepower;
    }


    public double getEngineSize() { return engineSize; }


    public void setEngineSize(double newEngineSize) {
        this.engineSize = newEngineSize;
    }


    public String toString() {
        String output = (this.color + " " + this.make + ", " + this.horsepower + ", " + this.engineSize);
        return output;
    }


}


/**
 * Created by dominicmassimo on 4/21/17.
 */
public class CarDriver {
    public static void main(String [] args) {

        Car myCar = new Car();
        Car hisCar = new Car("red", "mercedes", 400, 3.5);
        Car herCar = new Car("green", "acura", 300, 2.5);

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);


        myCar.setColor("orange");
        hisCar.setColor("orange");
        herCar.setColor("orange");

        myCar.setMake("Aston Martin");
        hisCar.setMake("Aston Martin");
        herCar.setMake("Aston Martin");

        myCar.setHorsepower(700);
        hisCar.setHorsepower(700);
        herCar.setHorsepower(700);

        myCar.setEngineSize(8.5);
        hisCar.setEngineSize(8.5);
        herCar.setEngineSize(8.5);


        System.out.println("\n(All cars have been changed to Orange Aston Martin's with 700HP and 8.5 Engine Size)");
        System.out.println("myCar: " + myCar.getColor() + " " + myCar.getHorsepower() + " " +  myCar.getEngineSize() + " " + myCar.getMake());
        System.out.println("hisCar: " + hisCar.getColor() + " " + hisCar.getHorsepower() + " " +  hisCar.getEngineSize() + " " + hisCar.getMake());
        System.out.println("herCar: " + herCar.getColor() + " " + herCar.getHorsepower() + " " +  herCar.getEngineSize() + " " + herCar.getMake());
    }
}
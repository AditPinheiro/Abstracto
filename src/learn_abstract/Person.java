package learn_abstract;

/**
 * Created by expert on 3/12/19.
 */
public class Person {

    String name;

    void run(){

    }

    void drive(Car car)
    {
        car.start();
        car.acceleration();
        car.stop();
        if(car instanceof BenzGLA)
            ((BenzGLA)car).heatseat();
        else
            System.out.println("Given car has no option for heating seat....SAD :(");

    }
}

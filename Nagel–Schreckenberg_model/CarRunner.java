package assignments.assignment3;

import info.gridworld.actor.Actor;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Random;

public class CarRunner {

    public static void main(String[] args) {
        int row = 10;
        int col = 50;
        Random random = new Random(03710052);
        ActorWorld world = new ActorWorld();
        world.setGrid(new BoundedGrid<Actor>(row, col));

        Car carOne = new Car();
        Car carTwo = new Car(1);
        Car carThree= new Car();
        Car carFour = new Car(1);
        Car carFive = new Car();
        Car carSix = new Car(2);
        Car carSeven = new Car();
        Car carEight = new Car(2);
        Car carNine = new Car();
        Car carTen = new Car();
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(carOne);
        cars.add(carTwo);
        cars.add(carThree);
        cars.add(carFour);
        cars.add(carFive);
        cars.add(carSix);
        cars.add(carSeven);
        cars.add(carEight);
        cars.add(carNine);
        cars.add(carTen);


        //Generate car at each lane
        for(int i = 0 ; i < row ; i++){
            if(random.nextDouble() < 0.5 *((double) (i+9)/9)){
                world.add(new Location(i, i+1), cars.get(i) );
            }
        }

        //Add car source
        for (int i = 0; i < row; i++) {
            world.add(new Location(i,0), new CarSource());
        }

        world.show();
    }
}


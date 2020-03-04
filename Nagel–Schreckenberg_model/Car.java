package assignments.assignment3;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.*;
import java.util.Random;

public class Car extends Actor {
    private int speed;
    final private static int MIN_SPEED = 0;
    final private static int MAX_SPEED = 5;
    final private static int DIRECTION = 90;
    private Random random = new Random(03710052);
    private Color color;

    public Car(){
        this.speed=0;
        this.setColor(Color.RED);
    }

    public Car(int speed) {
        if (MIN_SPEED <= speed && speed <= MAX_SPEED) {
            this.speed = speed;
        } else {
            System.out.println("Speed out of range (0-5), please import proper speed");
            return;
        }
    }

    public Car(int speed, Color color) {
        this.setColor(color);
        if (MIN_SPEED <= speed && speed <= MAX_SPEED) {
            this.speed = speed;
        } else {
            System.out.println("Speed out of range (0-5), please import proper speed");
            return;
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void act() {
        if (random.nextDouble() < 0.3) {
            this.dawdle();
        } else {
            this.accelerate();
        }
        this.brake();
        this.adjustColor();
        this.move();
    }

    public void move() {
        Grid<Actor> gr = this.getGrid();
        Location loc = this.getLocation();
        for (int i = 1; i <= speed; i++) {
            if (gr != null) {
                loc = loc.getAdjacentLocation(DIRECTION);
            }
        }
        if (gr.isValid(loc)) {
            this.moveTo(loc);
        } else {
            this.removeSelfFromGrid();
        }
    }

    public void brake() {
        Grid<Actor> gr = this.getGrid();
        Location loc = this.getLocation();
        int desireBrakeSpeed = 0;
        while (desireBrakeSpeed < speed) {
            loc = loc.getAdjacentLocation(DIRECTION);
            if (gr.isValid(loc)) {
                Actor neighbor = gr.get(loc);
                if (neighbor != null) {
                        break;
                }
            }desireBrakeSpeed++;
        } speed = desireBrakeSpeed;
    }

    public void accelerate() {
        if (speed < MAX_SPEED) {
            speed++;
        }
    }

    public void dawdle() {
        if (speed > 1 && random.nextDouble() <= 0.5) {
            speed = speed - 1;
        } else if (speed > 1 && random.nextDouble() > 0.5) {
            speed = speed - 2;
        } else if (speed > 0) {
            speed--;
        }
    }

    public void adjustColor() {
        if(speed == MAX_SPEED){this.setColor(Color.GREEN);}
        else if(speed < MAX_SPEED && speed > MIN_SPEED){this.setColor(Color.YELLOW);}
        else{this.setColor(Color.RED);}
    }
}


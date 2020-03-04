package assignments.assignment3;

import info.gridworld.actor.Actor;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;
import java.util.ArrayList;
import java.util.Iterator;
import info.gridworld.grid.Location;

public class ActorWorld extends World<Actor>{

    public ActorWorld() {
        super(new BoundedGrid(10, 50));
    }

    @Override
    public void show() {
        if (this.getMessage() == null) {
            this.setMessage("Click on a grid location to construct or manipulate an actor.");
        }
        super.show();
    }

    @Override
    public void step() {
        int stepCounter = 0;
        Grid<Actor> gr = this.getGrid();
        ArrayList<Actor> actors = new ArrayList();
        Iterator i$ = gr.getOccupiedLocations().iterator();

        while(i$.hasNext()) {
            Location loc = (Location)i$.next();
            actors.add(gr.get(loc));
        }

        i$ = actors.iterator();

        while(i$.hasNext()) {
            Actor a = (Actor)i$.next();
            if (a.getGrid() == gr) {
                a.act();
            }
        }
    }

    @Override
    public void add(Location loc, Actor occupant) {
        occupant.putSelfInGrid(this.getGrid(), loc);
    }

    @Override
    public Actor remove(Location loc) {
        Actor occupant = (Actor)this.getGrid().get(loc);
        if (occupant == null) {
            return null;
        } else {
            occupant.removeSelfFromGrid();
            return occupant;
        }
    }




}

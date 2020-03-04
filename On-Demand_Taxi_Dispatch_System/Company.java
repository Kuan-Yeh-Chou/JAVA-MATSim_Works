package assignments.assignment4;

import info.gridworld.actor.Actor;

import java.awt.*;

public class Company extends Actor {

    private String companyId;

    public Company(String companyId, Color color){
        this.companyId = companyId;
        this.setColor(color);
    }

    public String getCompanyId(){
        return this.companyId;
    }

    @Override
    public void act(){}
}

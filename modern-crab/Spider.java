// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Spider extends Actor
{

    /**
     * Act - do whatever the Spider wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (isGameOverSeesCrab()) {
            transitionToGameOverWorld();
        }
        if (isGameOverSeesFrog()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(2);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("eerie-horror-stab.wav");
        }
        Actor Frog = getOneIntersectingObject(Frog.class);
        if (Frog != null) {
            World world = getWorld();
            world.removeObject(Frog);
            Greenfoot.playSound("Roblox - Oof Death.wav");
        }
    }

    /**
     * 
     */
    public boolean isGameOverSeesCrab()
    {
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public boolean isGameOverSeesFrog()
    {
        World world = getWorld();
        if (world.getObjects(Frog.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
        Greenfoot.playSound("womp-womp.wav");
    }
}

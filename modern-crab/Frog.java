// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Frog extends Actor
{

    /**
     * Act - do whatever the Frog wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
        }
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        move(2);
        if (Greenfoot.isKeyDown("A")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("D")) {
            turn(5);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        if (worm != null) {
            World world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Worm.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
        Greenfoot.playSound("yay-from-fnaf.wav");
    }
}

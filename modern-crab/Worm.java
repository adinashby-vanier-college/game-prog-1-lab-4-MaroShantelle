// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Worm extends Actor
{

    /**
     * Act - do whatever the Worm wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Lobster.class)) {
            World world = getWorld();
            int x = getX();
            int y = getY();
            world.removeObject(this);
            Lobster lobster =  new  Lobster();
            Spider spider =  new  Spider();
            world.addObject(lobster, x, y);
            world.addObject(spider, x, y);
        }
    }
}

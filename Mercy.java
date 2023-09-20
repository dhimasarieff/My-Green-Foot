import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mercy extends pendukung
{
    int speed = 3;
    public void act()
    {
        Mercy a = new Mercy();
        Actor i = getOneIntersectingObject(Mercy.class);
        move(speed);
        checkdouble(i);
        end();
    }
}

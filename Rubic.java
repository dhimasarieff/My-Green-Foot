import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rubic extends pendukung
{
    int speed = -15;
    public void act()
    {
        Rubic a = new Rubic();
        Actor i = getOneIntersectingObject(Rubic.class);
        move(speed);
        checkdouble(i);
        end();
    }
}

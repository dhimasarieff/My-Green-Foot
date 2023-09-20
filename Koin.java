import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Koin extends pendukung
{
    int speed = 3;
    public void act()
    {
        Koin a = new Koin();
        Actor i = getOneIntersectingObject(Koin.class);
        move(speed);
        checkdouble(i);
        end();
    }
}

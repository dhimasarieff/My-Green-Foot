import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pendukung extends Actor
{
    public void act()
    {
        
    }
    
    public void end(){
        if(getY() >= 588||getY() <=0){
            getWorld().removeObject(this);
        }
    }
    
    public void checkdouble(Actor i){
        if(i!= null){
            getWorld().removeObject(i);
        }
    }
    
    public void move(int speed){
        setLocation(getX(), getY() + speed);
    }
}

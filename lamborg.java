import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class lamborg extends Actor
{
    int score = 0;
    public void act()
    {
        getWorld().showText("score : " + score, 70, 30);
        checkKey();
        end();
        addscore();
    }

    public void checkKey(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-2);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+2);
        }if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-2, getY());
        }if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2, getY());
        }
    }

    public void end(){
        if(isTouching(Mercy.class)||isTouching(Rubic.class)){
            getWorld().showText("Game Over \n Score : " + score, 300,300);
            Greenfoot.stop();
        }
    }

    public void addscore(){
        if(isTouching(Koin.class)){
            score = score + 50;
            removeTouching(Koin.class);
        }
    }
}

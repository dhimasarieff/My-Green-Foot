import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        lamborg lamborg = new lamborg();
        addObject(lamborg, 159,545);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new Mercy(), Greenfoot.getRandomNumber(200) + 30, 0);
        }
        if(Greenfoot.getRandomNumber(200)<1){
            addObject(new Rubic(), Greenfoot.getRandomNumber(200) + 20, 600);
        }
        if(Greenfoot.getRandomNumber(200)<1){
            addObject(new Koin(), Greenfoot.getRandomNumber(200) + 30, 0);
        }
}
}

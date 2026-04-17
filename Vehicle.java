import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Vehicle extends Actor
{
    public void act()
    {
        move(-3);
        if(getX() <= 0){
            resetVehicle();
        }
        if(isTouching(Hero.class)){
            World world = getWorld();
            Sadface sadFace = new Sadface();
            world.addObject(sadFace, 300, 200);
            
            Actor hero = getOneIntersectingObject(Hero.class);
            world.removeObject(hero);
            world.removeObject(this);
            Greenfoot.stop();
        }
    }
    public void resetVehicle(){
        // randomly choose lane 0 or 1
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600, 100);
        }else{
            setLocation(600, 300);
        }
        
    }
}

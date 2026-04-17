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
            Sadface sadFace = new Sadface();
            getWorld().addObject(sadFace,300,300);
            getWorld().removeObject(this);
        }
    }
    public void resetVehicle(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600, 100);
        }else{
            setLocation(600, 300);
        }
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) Lucian Hou
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    // true means Hero is in the top lane; false means bottom lane
    boolean atTop = true;
    public void act()
    {
        if(Greenfoot.mouseClicked(null)){
            atTop = !atTop;
        }
        if(atTop){
            setLocation(100,100);
        }else{
            setLocation(100,300);
        }
    }
}

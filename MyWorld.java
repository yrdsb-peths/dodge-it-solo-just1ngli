import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) Justin Li 
 * @version (a version number or a date) Version 1 (November 4 2025)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
    }
}

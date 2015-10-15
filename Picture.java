/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;   
    private Square greed;
    private Person p1;
    private Circle eye;
    private Triangle piramide;
    private Circle pupila;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        greed = new Square();
        greed.changeColor("green");
        greed.moveHorizontal(-320);
        greed.moveVertical(140);
        greed.changeSize(1200);
        greed.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();  
        
        piramide = new Triangle();        
        piramide.moveVertical(-70);
        piramide.moveHorizontal(-150);
        piramide.changeSize(100,100);
        piramide.changeColor("yellow");
        
        eye = new Circle();
        eye.changeColor("red");       
        eye.moveVertical(20);
        eye.moveHorizontal(-195);
        eye.changeSize(50);       
        
        pupila = new Circle();  
        pupila.changeSize(20); 
        pupila.moveHorizontal(-180);
        pupila.moveVertical(30);
        pupila.changeColor("green");
        
        
        
        
        
        
        
       
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void changeColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Change this picture to use sun move
     */
    public void moveSun()
    {
        if (wall != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(130);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            greed.changeColor("black");
            
         }
    }
    
    /**
     * Change this picture to use person
     */
    public void person()
    {
        if (wall != null)   // only if it's painted already...
        {
        p1 = new Person();
        p1.moveHorizontal(-300);
        p1.moveVertical(40);       
        p1.makeVisible();
        p1.slowMoveHorizontal(150);
        }
    }
    
     /**
     * Draw this picture.
     */
    public void Illuminati()
    {
        
        piramide.makeVisible();   
                      
        eye.makeVisible();
                
        pupila.makeVisible();

        
                   
                       
               
                
       
    }
     /**
     * Change this picture to use color display
     */
    public void illuminatycolor()
    {
        if (wall != null)   // only if it's painted already...
        {
            
            piramide.changeColor("black");           
            eye.changeColor("withe");
            pupila.changeColor("black");
            
        }
    }
}


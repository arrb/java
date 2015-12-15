package hw5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
     ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();

	    /** Initializes this class for drawing. */
	    public DrawGraphics() {
	        boxes.add(new BouncingBox(200, 50, Color.RED));
	        boxes.add(new BouncingBox(150, 60, Color.PINK));
	        boxes.add(new BouncingBox(60, 10, Color.BLACK));
	        boxes.add(new BouncingBox(250, 55, Color.CYAN));
	        for(int i = 0 ; i < boxes.size(); i++){
	        	int xIncrement = 10 ; 
	        	int yIncrement = 2 ; 
	        	boxes.get(i).setMovementVector(xIncrement, yIncrement);
	        	xIncrement *= 20 ;
	        	yIncrement *= 40;
	        }
	    }

	    /** Draw the contents of the window on surface. Called 20 times per second. */
	    public void draw(Graphics surface) {
	        byte [] barray = { 0x41, 0x4e, 0x41 };
	        surface.drawLine(50, 50, 250, 250);
	        for(int i = 0 ; i < boxes.size(); i++){
	        	boxes.get(i).draw(surface);
	        }
	        surface.drawRoundRect(20, 20, 20, 20, 30, 10);
	        surface.drawArc(50, 100, 200, 200, 100, 30);
	        surface.drawBytes(barray, 0, barray.length, 100, 40);
	    }
}

package DesignPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

int X;
int Y;


/*
 * Draw the circle on the position given by mouse listener
 */

	
  public Circle(int x, int y) {
	  
	System.out.println("Circel constructor called.");  
 
	this.X=x;
	this.Y=y;
}
	@Override
	public void draw(Graphics g) 
	{
	
		
		g.drawOval(X,Y,40, 40);
		
	}
	
	@Override
	public void addShapeNPoint(Shape s) {}
	@Override
	protected void drawAllShapes(Graphics g) {}
	
	

}
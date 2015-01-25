import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class Block extends JComponent 
{
	
	private int xPos, yPos, width, height, dx, dy;	
	
	
	public Block(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	
	public void draw(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle block = new Rectangle(xPos, yPos, width, height);
		Rectangle blockSlot = new Rectangle(xPos + 3, yPos, 4, 5);
		
		g2.setColor(Color.BLACK);
		g2.fill(block);
		
		g2.setColor(Color.WHITE);
		g2.fill(blockSlot);
	}
	
	public void step(){
		
	}
	public void move(){
		
	}
	public void update(){
		
	}
	
	
	
}


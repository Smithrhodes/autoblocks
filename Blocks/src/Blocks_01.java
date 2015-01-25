import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;

public class Blocks_01 extends JComponent 
{
	public Blocks_01(int x, int y, int w, int h)
	{
		xPos = x;
		yPos = y;
		width = w;
		height = h;
	}
	public void drawblock(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle block = new Rectangle(xPos, yPos, width, height);
		
		g2.setColor(Color.BLACK);
		g2.fill(block);
		
		block = new Rectangle(xPos + 3, yPos, 4, 5);
		g2.setColor(Color.WHITE);
		g2.fill(block);
	}
	
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;	
}


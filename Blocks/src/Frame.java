import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Stroke;

public class Frame extends JComponent 
{
	public Frame(int s, int fw, int fh)
	{
		strokeWidth = s;
		width = fw;
		height = fh;
	}
	public void drawFrame(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle frame_01 = new Rectangle(0, 0, width, height);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(strokeWidth));
		g2.draw(frame_01);
	}
	
	private int strokeWidth;
	private int width;
	private int height;
}
	import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
	
public class BlockWorld extends JComponent 
{
	
	private Block block;
	
	public BlockWorld(){
		int w = 20;
		int h = 20;
		//int x = (getWidth() /2) - w/2;
		//int y = (getHeight() /2) - h/2;
		
		block = new Block(400, 400, w, h);

		
	}
		public void paintComponent(Graphics g)
		{
			super.repaint();
			//Graphics2D g2 = (Graphics2D) g;
			drawOverlay(g);
			block.step(g);

		}
		
		public void drawOverlay(Graphics g){
			
			int stroke = 10;
			int width = 800;
			int height = 800;
		
			Graphics2D g2 = (Graphics2D) g;
			//MAGIC NUMBERS**** to get border visible inside frame edges
			Rectangle frame_01 = new Rectangle(5, 5, width-15, height-45);
			
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(stroke));
			g2.draw(frame_01);
			
		}
}

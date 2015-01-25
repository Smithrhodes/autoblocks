	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import javax.swing.JComponent;
	
public class Component_01__Blocks_01 extends JComponent 
{
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			

			int w = 10;
			int h = 10;
			int x = (getWidth() /2) - w/2;
			int y = (getHeight() /2) - h/2;
			
			Blocks_01 block_01 = new Blocks_01(x, y, w, h);
			block_01.drawblock(g2);
			
			int s = 15;
			int fw = getWidth() - 1;
			int fh = getHeight() - 1;
			
			Frame newFrame = new Frame(s, fw, fh);
			newFrame.drawFrame(g2);
		}
}

import javax.swing.JFrame;

public class BlocksViewer 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(600, 600);
		frame.setTitle("Blocks");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Component_01__Blocks_01 component = new Component_01__Blocks_01();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
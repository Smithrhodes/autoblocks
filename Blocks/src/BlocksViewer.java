import java.awt.EventQueue;

import javax.swing.JFrame;

public class BlocksViewer 
{
	public static void main(String[] args)
	{
		
		EventQueue.invokeLater(new Runnable() {

			public void run() {
		JFrame frame = new JFrame();
		
		frame.setSize(800, 800);
		frame.setTitle("Blocks");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Component_01__Blocks_01 component = new Component_01__Blocks_01();
		frame.add(new Component_01__Blocks_01());
		
		frame.setVisible(true);
	}
		});

}}
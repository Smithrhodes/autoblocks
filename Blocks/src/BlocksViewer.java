import java.awt.EventQueue;

import javax.swing.JFrame;

public class BlocksViewer 
{
	
	public static final int FPS = 30, WAIT = 1000/FPS; //Store the frames per second the game runs at and the time, in milliseconds, the computer has to wait between steps.
	
	public static Input input;

	public static void main(String[] args)
	{
		input = new Input();
		
		EventQueue.invokeLater(new Runnable() {

		public void run() {
		JFrame frame = new JFrame();
		
		frame.setSize(800, 800);
		frame.setTitle(" aut0 Bl0cks");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(new BlockWorld());
		frame.setResizable(false);
		
		frame.setVisible(true);

		
		}
		});

}}
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;



public class Input implements KeyListener, MouseListener, MouseMotionListener{
	
	public boolean up, down, left, right, primary, secondary, reset, pause, escape; //Stores the states of all the various keys.
	public Point mouse_pos; //Stores the position of the mouse on the screen.

	/*
	 * Constructor to create a new input object.
	 */
	public Input(){
		mouse_pos = new Point(0, 0); 
	}
	
	public void keyPressed(KeyEvent e){ //If the player pressed a key...
		if(e.getKeyCode() == KeyEvent.VK_W){up = true;} //Check all of the keys, and set the appropriate key value to true.
		else if(e.getKeyCode() == KeyEvent.VK_Q){left = true;}
		else if(e.getKeyCode() == KeyEvent.VK_S){down = true;}
		else if(e.getKeyCode() == KeyEvent.VK_E){right = true;}
		else if(e.getKeyCode() == KeyEvent.VK_R){reset = true;}
		else if(e.getKeyCode() == KeyEvent.VK_ESCAPE){escape = true;}
		else if(e.getKeyCode() == KeyEvent.VK_P){pause = !pause;}
	}

	public void keyReleased(KeyEvent e){ //If the user released a key...
		if(e.getKeyCode() == KeyEvent.VK_W){up = false;} //Check all of the keys, and set the appropriate key value to false.
		else if(e.getKeyCode() == KeyEvent.VK_Q){left = false;}
		else if(e.getKeyCode() == KeyEvent.VK_S){down = false;}
		else if(e.getKeyCode() == KeyEvent.VK_E){right = false;}
		else if(e.getKeyCode() == KeyEvent.VK_R){reset = false;}
		else if(e.getKeyCode() == KeyEvent.VK_ESCAPE){escape = false;}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void mouseClicked(MouseEvent e){}
	
	public void mouseEntered(MouseEvent e){}

	public void mouseExited(MouseEvent e){}

	public void mousePressed(MouseEvent e){
		if(e.getButton() == MouseEvent.BUTTON1){primary = true;} //If the user pressed the left mouse button, set the value to true;
		else if(e.getButton() == MouseEvent.BUTTON3){secondary = true;} //If the user pressed the right mouse button, set the value to true;
	}

	public void mouseReleased(MouseEvent e){
		if(e.getButton() == MouseEvent.BUTTON1){primary = false;} //If the user pressed the left mouse button, set the value to false;
		else if(e.getButton() == MouseEvent.BUTTON3){secondary = false;} //If the user pressed the right mouse button, set the value to false;
	}

	public void mouseDragged(MouseEvent e){ //If the user moved the cursor...
		mouse_pos = e.getPoint(); //Update the mouse position.
	}

	public void mouseMoved(MouseEvent e){ //If the user moved the cursor while the mouse button is pressed...
		mouse_pos = e.getPoint(); //Update the mouse position.
	}
}
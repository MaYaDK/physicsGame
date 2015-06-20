package physicsGame;
//Access draw content
import javax.swing.JPanel;
//Access action/movement
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
//Access Keyboard
import java.awt.event.KeyListener;

public class UserInput  extends JPanel implements ActionListener, KeyListener{
	Timer tm = new Timer(5, this);

	boolean isKeyPressed;

//Class constructor
	public UserInput(){
		tm.start(); //start timer
		addKeyListener(this); 
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		checkInput();
		}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println(isKeyPressed);
		repaint();
	}

	public void checkInput(){
	}

	public void keyPressed(KeyEvent e)
	{
		int c = e.getKeyCode();
		if(c == KeyEvent.VK_SPACE){
		}
		if(c == KeyEvent.VK_ENTER){ 
			isKeyPressed = true;
		}
	}
	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
	
	public static void main(String[] args) {

	}
}


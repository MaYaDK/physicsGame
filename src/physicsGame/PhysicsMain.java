package physicsGame;
import javax.swing.JFrame;

//Access graphics
import java.awt.Graphics;

public class PhysicsMain extends UserInput{
	public static int screenHeight = 1920, screenWidth = 1080;

	public PhysicsMain(){
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
	}
	
	public static void main(String[] args) {
		PhysicsMain t = new PhysicsMain();
		JFrame jf = new JFrame();
		jf.setTitle("Physics"); //Displaying the title on the frame
		jf.setSize(screenHeight, screenWidth); //Setting size of frame (x,y);
		jf.setVisible(true); //Display the frame.
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		jf.add(t);
	}
}

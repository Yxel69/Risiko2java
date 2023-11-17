import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Screen{
    public static void main(String[] args) {
    	  
    	// Get the default toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        // Get the screen size
        Dimension screenSize = toolkit.getScreenSize();
        
    	
    	System.out.printf("Screen Width: %.0f, Screen Height: %.0f%n", screenSize.getWidth(), screenSize.getHeight());
    	// Create a JFrame (window)
        JFrame frame = new JFrame("ObjectDisplayExample");
        
		frame.setPreferredSize(screenSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed

        //Import an Array holding all Starsystems
        
        
 
        // Make the frame visible
        frame.setVisible(true);
       
    }
   }

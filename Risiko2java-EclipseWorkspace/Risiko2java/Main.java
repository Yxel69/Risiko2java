import java.util.Scanner;
import java.util.Random;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
Map Universe;

	public Main() {
		
	}
      
	
	
	public static void main(String[] args) {
		//System.out.print("Thank you for playing Risiko2 \n");
		DefineUniverse();
	}
	
	public static Map DefineUniverse() {
		Map Universe = new Map(); //declare Universe Map 
		Random rand = new Random(); //random 
		
		Universe.gnr = 0; // set galaxyvalue as zero
		Universe.sysnr = 0; //set number of systems as zero
		Universe.playernr = 0; //set number of players as zero
		
		 // Get the default toolkit
	       Toolkit toolkit = Toolkit.getDefaultToolkit();
	      
	      // Get the screen size
	       Dimension screenSize = toolkit.getScreenSize();

	  	  // Create a JFrame (window)
	       JFrame frame = new JFrame("Risiko2");
	        frame.setSize(1440,1080);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed

	       JPanel panel = new JPanel();
	       
	       JLabel label = new JLabel("Enter your name:");
	       JTextField textField = new JTextField(20);
	       JButton button = new JButton("Submit"); 
	       
	       JLabel label2 = new JLabel("Enter your name:");
	       JTextField textField2 = new JTextField(20);
	       JButton button2 = new JButton("Submit"); 
	       
	        panel.add(label);
	        
	        panel.add(textField);
	      
	        panel.add(button);
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Perform an action when the button is clicked
	                String name = textField.getText();
	                System.out.println("Hello, " + name + "!");
	            }
	        });
	     // Add the panel to the frame
	        frame.add(panel);
	        
            panel.add(label2);
	        
	        panel.add(textField2);
	      
	        panel.add(button2);
	        button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Perform an action when the button is clicked
	                String name = textField.getText();
	                System.out.println("Hello, " + name + "!");
	            }
	        });
	        
	        // Make the frame visible
	        frame.setVisible(true);  
	  
	      
			  //create Universe parameters
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Pls Enter the Amount of Galaxys"); //amount of galaxys in the universe
			Universe.gnr = scan.nextInt();
			
			System.out.println("Pls Enter the Amount of Planets per Galaxy"); //amount of planets per galaxy
			Universe.sysnr = scan.nextInt();
			
 			System.out.println("Pls Enter the Amount of Players per Galaxy"); //players per galaxy
			Universe.playernr = scan.nextInt();
					
			//Graphical Part assign x and y coordinates 16|9
			 
			    int gtmp = Universe.gnr;
			    int systmp = Universe.sysnr;

			    

			    while (gtmp != 0) {
			        gtmp = gtmp - 1;
			        while (systmp != 0) {
			            systmp = systmp - 1;
			            Universe.galaxys[gtmp].starsystems[systmp].x = rand.nextInt(0,178); //aspect ratio 16
			            Universe.galaxys[gtmp].starsystems[systmp].y = rand.nextInt(0,100);// to 9
			            Universe.galaxys[gtmp].starsystems[systmp].pn = systmp;

			        }
			        systmp =  Universe.sysnr;
			    }

 			System.out.print(Universe.galaxys[0].starsystems[3].pn);
			return Universe;
       }
}
 
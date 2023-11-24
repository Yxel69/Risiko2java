import java.util.Scanner;

import java.util.Random;
import java.awt.*;

import javax.swing.BoxLayout;
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
	
	Main main = new Main();
	Map Universe = new Map();
	
	Universe  = main.GetParameters();
			Universe.CreateMap();
			main.CreateCoordinates()
			
;	}
		public Map GetParameters() {
		System.out.print("Thank you for playing Risiko2 \n");
		Map Universe = new Map(); //declare Universe Map 
		
        //variables
		Universe.gnr = 0; // set galaxy-value as zero
		Universe.sysnr = 0; //set number of systems as zero
		Universe.playernr = 0; //set number of players as zero
		boolean i1 = false;
		boolean i2 = false;
		
	      //create Universe parameters
		
		  // Get the default toolkit
	       Toolkit toolkit = Toolkit.getDefaultToolkit();
	      
	      // Get the screen size
	       Dimension screenSize = toolkit.getScreenSize();
	       
	  	  // Create a JFrame (window)
	       JFrame frame = new JFrame("Risiko2");
	        
	      //Create a JPanel
	       JPanel panel = new JPanel();
	      //Create a InputComplex 
	       JLabel label = new JLabel("Pls Enter the Amount of Galaxys:");
	       JTextField textField = new JTextField(20);
	       JButton button = new JButton("Submit Galaxys"); 
	       //Create a second InputComplex 
	       JLabel label2 = new JLabel("Pls Enter the Amount of Planets per Galaxy:");
	       JTextField textField2 = new JTextField(20);
	       JButton button2 = new JButton("Submit Planets"); 
	       frame.add(panel); //add the panel to the frame
            panel.setLayout(new GridLayout(0,3)); //set grid layout
            
	        panel.add(label); 
	        panel.add(textField);
	        panel.add(button);
	       
            panel.add(label2);
	        panel.add(textField2);
	        panel.add(button2);
	        
	     // Make the frame visible
	        
	        frame.setSize(screenSize); //size frame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
	        frame.setVisible(true);  
		
	      
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Perform an action when the button is clicked
	            	Universe.gnr = Integer.parseInt(textField.getText());
	           
	            	
	            	panel.remove(label); 
	    	        panel.remove(textField);
	    	        panel.remove(button);
	    	        panel.revalidate();
	    	        panel.repaint();

	      		       
	            }
	        });
	        
	        button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Perform an action when the button is clicked
	            	Universe.sysnr = Integer.parseInt(textField.getText());
	            	
	            	panel.remove(label2); 
	    	        panel.remove(textField2);
	    	        panel.remove(button2);
	    	        panel.revalidate();
	    	        panel.repaint();

	            }
	        });
	        return Universe;
		}
	       
	  public void CreateCoordinates() {
	      //Graphical Part assign x and y coordinates 16|9
        	Random rand = new Random(); //random 
        	
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
		    System.out.print("ye ye ass");
         
		
	}
	
}
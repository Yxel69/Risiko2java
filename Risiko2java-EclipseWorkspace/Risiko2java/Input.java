import java.util.Scanner;
public class Input {

	
	public Input() {
		
	}

	
	public static void main() {
		
		Map Universe = new Map(); //declare Universe Map 
		Universe.gnr = 0; // set galaxyvalue as zero
		Universe.sysnr = 0; //set number of systems as zero
		Universe.playernr = 0; //set number of players as zero
		
		boolean univselected; //boolean for following while loop
		
			while(univselected = false) {  //create Universe parameters
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Pls Enter the Amount of Galaxys"); //amount of galaxys in the universe
			Universe.gnr = scan.nextInt();
			System.out.print(Universe.gnr);
			System.out.println("Pls Enter the Amount of Planets per Galaxy"); //amount of planets per galaxy
			Universe.sysnr = scan.nextInt();
			System.out.print(Universe.sysnr);
 			System.out.println("Pls Enter the Amount of Players per Galaxy"); //players per galaxy
			Universe.playernr = scan.nextInt();
			System.out.print(Universe.playernr);
			
			
			 if(Universe.sysnr > 0 && Universe.gnr > 0) {
				univselected = true;
			}
			 else {
				 univselected = false;
			 }
			}
			//create Universe with values from above
			Universe.CreateMap();
			
	 }
	}


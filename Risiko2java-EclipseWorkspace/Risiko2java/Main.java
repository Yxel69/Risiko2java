import java.util.Scanner;

public class Main {
Map Universe;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.print("Thank you for playing Risiko2 \n");
		DefineUniverse(); 
		
		
	}
	
	public static Map DefineUniverse() {
		Map Universe = new Map(); //declare Universe Map 
		Universe.gnr = 0; // set galaxyvalue as zero
		Universe.sysnr = 0; //set number of systems as zero
		Universe.playernr = 0; //set number of players as zero
		
			  //create Universe parameters
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Pls Enter the Amount of Galaxys"); //amount of galaxys in the universe
			Universe.gnr = scan.nextInt();
			
			System.out.println("Pls Enter the Amount of Planets per Galaxy"); //amount of planets per galaxy
			Universe.sysnr = scan.nextInt();
			
 			System.out.println("Pls Enter the Amount of Players per Galaxy"); //players per galaxy
			Universe.playernr = scan.nextInt();
					
			//create Universe with values from above
			
			    int gtmp = Universe.gnr;
			    int systmp = Universe.sysnr;

			    Universe.galaxys = new Galaxy[Universe.gnr];

			    while (gtmp != 0) {
			        gtmp = gtmp - 1;
			        Universe.galaxys[gtmp] = new Galaxy();
			        Universe.galaxys[gtmp].starsystems = new Starsystem[Universe.sysnr];
		            Universe.galaxys[gtmp].gn = gtmp;
			        
			        while (systmp != 0) {
			            systmp = systmp - 1;
			            Universe.galaxys[gtmp].starsystems[systmp] = new Starsystem();
			            Universe.galaxys[gtmp].starsystems[systmp].pn = systmp;
			            
			        }
			        systmp =  Universe.sysnr;
			    }
			    
			   
			
 			
 			System.out.print(Universe.galaxys[0].starsystems[3].pn);
			return Universe;
              }

}

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.print("Thank you for playing Risiko2"+"");
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
			
			Universe.CreateMap();
			
			
			//create Universe with values from above
 			Universe.galaxys = Universe.CreateMap();
			return Universe;
              }

}

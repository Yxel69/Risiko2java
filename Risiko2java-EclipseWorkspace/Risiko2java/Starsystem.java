import java.util.Random;

 public class Starsystem {
	
	Random rand = new Random();
	
	 		public Starsystem() {
	 			
		double Shield; //0.0 to 0.5x multiplier against attacker in combat
		int Ships;	//Number of Ships present in the system
		int Production; //number of ships produced per round
		Shield = rand.nextDouble(0,0.5); //assign multiplier value
		Production = rand.nextInt(0,10); //assign production value
		int xcoord; //x-coordinate in space
		int ycoord; //y-coordinate in space
		boolean pirates; //are there pirates on the planet?
		int ownedbyplayer; //value of player/playernumber identifies all planets owned by said player
	    int galaxynr; //which galaxy the planet is in
	 	
	 		}
  class Wormhole extends Starsystem{
	  int destination;
	  
  }
	 		
	 		
	 		
  public static void main(String[] args) {
		

	}

}
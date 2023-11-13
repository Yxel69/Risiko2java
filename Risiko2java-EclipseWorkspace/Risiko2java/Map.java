import java.util.Random;

public class Map {
Galaxy[] galaxys;
int gnr;
int sysnr;
int playernr;

	public Map() {
		int gnr; //number of galaxys
		int sysnr; //number of systems per galaxy
		int playernr; //number of player per galaxy
	  
	}

	public Galaxy[] CreateMap() {
	    int gtmp = this.gnr;
	    int systmp = this.sysnr;

	    galaxys = new Galaxy[this.gnr];

	    while (gtmp != 0) {
	        gtmp = gtmp - 1;
	        galaxys[gtmp] = new Galaxy();
	        galaxys[gtmp].starsystems = new Starsystem[this.sysnr];

	        while (systmp != 0) {
	            systmp = systmp - 1;
	            galaxys[gtmp].starsystems[systmp] = new Starsystem();
	        }
	        systmp = this.sysnr;
	    }
	    
	    return galaxys;
	}
		
}
	

	
			

	

	
import java.util.Random;

public class Map {
int gnr;
int sysnr;
int playernr;
public Galaxy[] galaxys;

	public Map() {
		int gnr; //number of galaxys
		int sysnr; //number of systems per galaxy
		int playernr; //number of player per galaxy
	     Galaxy[] galaxys;
	}

	public  Galaxy[] CreateMap() {
		
	 int gtmp = gnr; //while-loop runs for as many galaxys as given by Universe Creator
	 int systmp = sysnr; //	while-loop runs until all systems are created
	Galaxy[] galaxys = null;
	
	 while(gtmp > 0) {
		   galaxys[gtmp]=new Galaxy();
		while(systmp > 0) {
			
		   galaxys[gtmp].starsystems[sysnr] = new Starsystem();
		   systmp = systmp-1;
		}
		   
		   gtmp = gtmp-1;
	    
	    }
	 return galaxys;
	 
	    	 
	      }
		
		
	}

	
			

	

	
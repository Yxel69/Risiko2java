
public class Map {
int gnr;
int sysnr;
int playernr;

	public Map() {
		int gnr; //number of galaxys
		int sysnr; //number of systems per galaxy
		int playernr; //number of player per galaxy
	}

	public void CreateMap() {
		int count = 1;
	 int gtmp = gnr; //while-loop runs for as many galaxys as given by Universe Creator
	 int systmp = sysnr; //	while-loop runs until all systems are created
	  while(gtmp > 0) {
	   while(systmp > 0) {
	    Starsystem[] tmp = new Starsystem[sysnr]; //name of array should be value of count
	    
		   
		   
		   
		   count = count+1;
	    
	    
	    
	    
	    
	    	  
	   }
	    	  gtmp = gtmp-1;
	      }
		
		
	}

	
			

	

	
	
	
	
	
 
}
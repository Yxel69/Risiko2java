import java.util.Scanner;
public class Input {

	
	public Input() {
		
	}

	public static void CreateMap() {
		Map map = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Pls Enter the Amount of Systems per Galaxy");
		map.sysnr = scan.nextInt();
		System.out.print(map.sysnr);
		
	 }
	}


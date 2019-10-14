//Matt Lynn
//10/14/19
import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		
		double length, width, height=0, area, perimeter, volume;
		Boolean quit = true;
		String calcType = "";
		String cont = "";
		int roomNum = 1;
		Scanner userEntry= new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus Room Generator!");
		
		do {
			System.out.println("Would you like to calculate area or volume?");
			calcType = userEntry.nextLine();
			System.out.print("Enter Length (in feet): ");
			length = userEntry.nextDouble();
			System.out.print("Enter Width (in feet): ");
			width = userEntry.nextDouble();
			
			if(calcType.equalsIgnoreCase("volume") || calcType.equalsIgnoreCase("v")) {
				
				System.out.print("Enter Volume (in feet): ");
				height = userEntry.nextDouble();
			}
			double[] results = calc(length, width, height);
			area= results[0];
			perimeter = results[1];
			volume = results[2];
			System.out.println("The area of the room is: " + area + " feet." );
			System.out.println("The perimeter of the room is: " + perimeter + " feet." );
			userEntry.nextLine();
			if(calcType.equalsIgnoreCase("volume") || calcType.equalsIgnoreCase("v")) {
				System.out.println("The volume of the room is: " + volume + " feet." );

			}
			for(int i=0; i<7; i++)
			{
			System.out.print("Would you like to measure another room? (y/n): ");
			cont = userEntry.nextLine();
			if(cont.equalsIgnoreCase("N")) {
				quit = true;
				i=7;
			}
			
			else if(cont.equalsIgnoreCase("Y")) {
			System.out.println("Righto! On to room number " + ++roomNum);
			i=7;
			}
			else {
				System.out.println("Sorry, invalid option!");
			}
			}
			

			
		} while(quit == false);

		
		


	}
	
	public static double[] calc(double l, double w, double h) {
		double[] results = new double[3];
		results[0] = l*w;		//area
		results[1] = 2*l + 2*w; //perimeter
		results[2] = l*w*h;		//volume
		return (results);
	}
}

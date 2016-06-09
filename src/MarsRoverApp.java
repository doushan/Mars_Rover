import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MarsRoverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				BufferedReader br = new BufferedReader(new FileReader("direction.txt"));
				String movement, coordinates, maxSize = "";
				maxSize = br.readLine();
				int a; //variable a and b to represent the size of the plateau 
				int b;
				int x; //variable x and y to represent the position of the x and y coordinate
				int y;
				String d; //represent the direction that the rover is facing
			
				a = ((int)(maxSize.charAt(0)))-48;
				b = ((int)maxSize.charAt(2))-48;
				System.out.println("Expected Output:");
				
				while(((coordinates =br.readLine()) != null)&&(coordinates.length()!=0)) {
					movement = br.readLine();
					
					x = ((int)(coordinates.charAt(0)))-48;
					y = ((int)coordinates.charAt(2))-48;
					d = Character.toString(coordinates.charAt(4));
					
					Plateau mr = new Plateau(x, y, d, a, b);
					mr.functDirection(movement);
					mr.displayPosition();
				}
				
				System.out.println("==========");
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}



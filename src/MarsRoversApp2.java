import java.util.Scanner;

public class MarsRoversApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		int a, b;
		a = sn.nextInt();
		b = sn.nextInt();
		
		int x, y;
		String d, i;
		
		x = sn.nextInt();
		y = sn.nextInt();
		d = sn.next();
		
		Platform mr = new Platform(x, y, d);
		
		String m=null;
		
		while(true){
			m = sn.next();
			if(m.equals("L")){
				
				System.out.println("m"+m);
				if( mr.getDirectionD().equals("N")){
					mr.setDirectionD("W");	
				}
				else if(mr.getDirectionD().equals("S")){
					mr.setDirectionD("E");
				}
				else if(mr.getDirectionD().equals("E")){
					mr.setDirectionD("N");
				}
				else if(mr.getDirectionD().equals("W")){
					mr.setDirectionD("S");
				}
			}
			else if(m.equals("R")){
				if(mr.getDirectionD().equals("N")){
					mr.setDirectionD("E");
				}
				else if(mr.getDirectionD().equals("S")){
					mr.setDirectionD("W");
				}
				else if(mr.getDirectionD().equals("E")){
					mr.setDirectionD("S");
				}
				else if(mr.getDirectionD().equals("W")){
					mr.setDirectionD("N");
				}
			}
			else if(m.equals("M")){
				if(mr.getDirectionD().equals("N")){
					mr.setPositionY(mr.getPositionY()+1);
				}
				else if(mr.getDirectionD().equals("S")){
					mr.setPositionY(mr.getPositionY()-1);
				}
				else if(mr.getDirectionD().equals("E")){
					mr.setPositionX(mr.getPositionX()+1);		
				}
				else if(mr.getDirectionD().equals("W")){
					mr.setPositionX(mr.getPositionX()-1);
				}
			}
			else if(m.equals("D")){
				mr.displayPosition();
				break;
			}
		}
	}

}

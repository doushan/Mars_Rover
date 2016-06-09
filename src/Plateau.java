
public class Plateau {
	private int x;
	private int y;
	private  String d;
	private int a;
	private int b;
	
	Constant no = Constant.North;
	Constant so = Constant.South;
	Constant es = Constant.East;
	Constant we = Constant.West;
	
	Constant lf = Constant.LEFT;
	Constant rt = Constant.RIGHT;
	Constant mv = Constant.MOVE;
	
	public Plateau(int x, int y, String d, int a, int b){
		this.x=x;
		this.y=y;
		this.d=d;
		this.a=a;
		this.b=b;
	}

	
	public int getPositionX(){
		return x;
	}
	
	public int getPositionY(){
		return y;
	}
	
	public String getDirectionD(){
		return d;
	}
	
	public void displayPosition(){
		System.out.println(getPositionX()+" "+getPositionY()+" "+getDirectionD());
	}
	
	public void functDirection(String n){
		String m;
		for(int j=0; j<n.length();j++){
			m = Character.toString(n.charAt(j));	
			if(m.equals(lf.getDirection())){
				if(d.equals(no.getDirection())){
					d=(we.getDirection());	
				}
				else if(d.equals(so.getDirection())){
					d=(es.getDirection());
				}
				else if(d.equals(es.getDirection())){
					d=(no.getDirection());
				}
				else if(d.equals(we.getDirection())){
					d=(so.getDirection());
				}
			}
			else if(m.equals(rt.getDirection())){
				if(d.equals(no.getDirection())){
					d=(es.getDirection());
				}
				else if(d.equals(so.getDirection())){
					d=(we.getDirection());
				}
				else if(d.equals(es.getDirection())){
					d=(so.getDirection());
				}
				else if(d.equals(we.getDirection())){
					d=(no.getDirection());
				}
			}
			else if(m.equals(mv.getDirection())){
				if(d.equals(no.getDirection())){
					y+=1;
				}
				else if(d.equals(so.getDirection())){
					y+=-1;
				}
				else if(d.equals(es.getDirection())){
					x+=1;		
				}
				else if(d.equals(we.getDirection())){
					x+=-1;
				}
			}
			else{
				errorMessage();
			}
		}
		outsidePlatform(a,b,x,y);
		
	}

	public static void outsidePlatform(int a, int b, int x, int y){
		if((x>a)||(y>b)||(x<0)||(y<0)){
			System.out.println(" ");
			System.out.println("Mars Rover has gone outside plateau");
		}	
	}
	
	public static void errorMessage(){
		System.out.println("Invalid Input");
	}
}

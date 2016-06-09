
public enum Constant {
	North("N"),
	South("S"),
	East("E"),
	West("W"),
	
	LEFT("L"),
	RIGHT("R"),
	MOVE("M");
	
	
	private String directionCode;
	
	private Constant(String directionCode){
		this.directionCode=directionCode;
	}
	
	public String getDirection(){
		return directionCode;
	}
	
	public void setDirection(String directionCode){
		this.directionCode=directionCode;
	}
}

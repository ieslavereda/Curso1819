package common;

public class Shape {

	private int numSides;
	private boolean regular;
	
	public Shape() {
	}
	
	public Shape(int numSides,boolean regular) {
		this.numSides=numSides;
		this.regular=regular;
	}
	
	public int getNumSides() {
		return numSides;
	}
	public boolean getRegular() {
		return regular;
	}
	
	public void setNumSides(int numSides) {
		this.numSides=numSides;
	}
	public void setRegular(boolean regular) {
		this.regular=regular;
	}
	
}

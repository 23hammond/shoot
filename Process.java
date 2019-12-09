package shoot;

public class Process {
	public static double getDistance(int oX, int oY, int cX, int cY) {
		// pretty easy to do, mostly putting it over here so the main code is more compact
		return Math.sqrt(Math.pow(getXDist(oX,cX), 2) + Math.pow(getYDist(oY,cY), 2));
	}
	
	
	// the following 2 methods are so incredibly simple but they are separate so it's more "modular" so-to-speak
	// and these operations can be used in as many parts of the program as possible
	public static double getXDist(int oX, int cX) {
		return cX-oX;
	}
	
	public static double getYDist(int oY, int cY) {
		return cY-oY;
	}
	
	public static double getAngle(double distance, int oY, int cY) {
		// simple arcsine function between distance and y distance
		return Math.asin((cY - oY)/distance);
	}
}
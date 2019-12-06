package shoot;

public class Process {
	public static double getDistance(int oX, int oY, int cX, int cY) {
		// pretty easy to do, mostly putting it over here so the main code is more compact
		return Math.sqrt(Math.pow(cX - oX, 2) + Math.pow(cY - oY, 2));
	}
	
	public static double getAngle(double distance, int oY, int cY) {
		// simple arcsine function between distance and y distance
		return Math.asin((cY - oY)/distance);
	}
}
package org.usfirst.frc.team5483.robot.utils;

public class RobotMath {
	
	public static double deadZone(double x) {
		if(Math.abs(x) > 0.3) {
			return x;
		}
		
		return 0;
	}
	
	public static double sigmoid(double a, double deadZone) {
		int mul = 1;
		if(a < 0) mul = -1;
		return mul*(1 / ( 1 + Math.pow(Math.E,(-8*a*mul + 4))));
	}
}

package org.usfirst.frc.team5483.robot.toolbox;

public class Math {
	
	public static int squareMaintainSign(int val) {
        return absoluteValue(val * val);
    }
	
	public static double squareMaintainSign(double val) {
        return absoluteValue(val * val);
    }
	
	public static double calcLeftDrive(double x, double y) {
        return limitValue(y + x);
    }
    
    public static double calcRightDrive(double x, double y) {
        return limitValue(y - x);
    }
    
    public static double limitValue(double val) {
        return limitValue(val, 1.0);
    }
    
    public static double limitValue(double val, double max) {
        if(val > max) return max;
        if(val < -max) return -max;
       
        return val;
    }
    
    public static int absoluteValue(int value) {
    	if(value < 0) value = -value;
    	return value;
    }
    
    public static double absoluteValue(double value) {
    	if(value < 0) value = -value;
    	return value;
    }
}

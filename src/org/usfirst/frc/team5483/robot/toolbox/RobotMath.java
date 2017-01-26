package org.usfirst.frc.team5483.robot.toolbox;

public class RobotMath {
	
	public static double PI = 3.141592653589793;
	public static double E = 2.718281828459045;
	
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
    
    public static double sigmoidDriveFunction(double x) {
    	return 1 / (1 + Math.pow(E, 10*(-x+0.5)));
	}
    
    public static double sigmoidFunction(double x) {
    	return (1/( 1 + Math.pow(E,(-1*x))));
	}
    
    public static double pow(double base, double exponent) {
    	double result = 1;
    	
    	for(int i = 0; i < exponent; i++) {
    		result *= base;
    	}
    	
    	return result;
    }
}

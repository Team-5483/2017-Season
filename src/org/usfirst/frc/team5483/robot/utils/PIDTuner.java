package org.usfirst.frc.team5483.robot.utils;

public class PIDTuner {
	public double pidTuned(double setpoint, double current, 
			double Kp, double Ki, double Kd) {
		
		double error = setpoint - current;
		double P = Kp * error;
		
		static double accumError = 0;
		accumError += error;
		double I = Ki * accumError;
		static double lastError = 0;
		double errorDiff = error - lastError;
		lastError = error;
		double D = Kd * errorDiff;
		
		return P + I + D;
	}
}

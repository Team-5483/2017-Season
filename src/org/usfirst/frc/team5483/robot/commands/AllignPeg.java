package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.CameraReceiver;
import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AllignPeg extends Command{
	private boolean finished = false;
	
	//if smaller than its close enough to be good
	private int closeEnough = 3;
	
	public void execute() {
		//Goes slower as it approaches goal
		double distance = (CameraReceiver.x-CameraReceiver.middle)/CameraReceiver.camWidth;
		Robot.chassis.middleDrive(sqrtNeg(distance));
		
		//compare box sizes and turn so they are equal, also slows down as it approaches goal
		double turnValue = (CameraReceiver.wRight-CameraReceiver.wLeft)/CameraReceiver.camWidth;
		Robot.chassis.drive(sqrtNeg(turnValue), sqrtNeg(-turnValue));
		if(distance <= closeEnough/CameraReceiver.camWidth && turnValue <= closeEnough/CameraReceiver.camWidth) finished = true;
	}
	
	private double sqrtNeg(double a) {
		int mul = 1;
		if(a < 0) mul = -1;
		return mul * Math.sqrt(a*mul);	
	}
	
	protected boolean isFinished() {
		return finished;
	}

}

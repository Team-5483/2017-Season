package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;
import org.usfirst.frc.team5483.robot.utils.PIDTuner;

import edu.wpi.first.wpilibj.command.Command;

public class DriveXDistance extends Command {
	
	//everything will be in centimeters -Evan
	
	private double destDistance = 0;
	private double curDistance  = 0;
	
	private double wheelCircum = 47.87787204070906;
	
	private PIDTuner leftPID;
	private PIDTuner rightPID;
	int leftMul = 1, rightMul = 1;
	
	public DriveXDistance(double centimeters) {
		destDistance = centimeters;
		leftPID = new PIDTuner();
		rightPID = new PIDTuner();
	}
	
	@Override
	public void execute() {
		curDistance = (Robot.chassis.getLeftEncoder().getDistance() + Robot.chassis.getRightEncoder().getDistance()) / 2;
		
		Robot.chassis.drive( leftPID.pidTuned(destDistance, curDistance, 0.6, 0.0, 0.0)*leftMul, 
						    rightPID.pidTuned(destDistance, curDistance, 0.6, 0.0, 0.0)*rightMul);
	}
	
	@Override
	protected boolean isFinished() {
		if(((curDistance / 20) * wheelCircum) >= destDistance) {
			Robot.chassis.resetLeftEncoder();
			Robot.chassis.resetRightEncoder();
			Robot.chassis.drive(0, 0);
			return true;
		}
		
		return false;
	}

	public int getLeftMul() {
		return leftMul;
	}

	public void setLeftMul(int leftMul) {
		this.leftMul = leftMul;
	}

	public int getRightMul() {
		return rightMul;
	}

	public void setRightMul(int rightMul) {
		this.rightMul = rightMul;
	}
	
}

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
	
	public DriveXDistance(double centimeters) {
		destDistance = centimeters;
		leftPID = new PIDTuner();
		rightPID = new PIDTuner();
	}
	
	@Override
	public void execute() {
		curDistance = (Robot.chassis.getLeftEncoder().getDistance() + Robot.chassis.getRightEncoder().getDistance()) / 2;
		Robot.chassis.drive( leftPID.pidTuned(destDistance, curDistance, 0.5, 0.0, 0.0), 
						    rightPID.pidTuned(destDistance, curDistance, 0.5, 0.0, 0.0));
		
	}
	
	@Override
	protected boolean isFinished() {
		if(((curDistance / 20) * wheelCircum) >= destDistance) {
			Robot.chassis.resetLeftEncoder();
			Robot.chassis.resetRightEncoder();
			return true;
		}
		
		return false;
	}

}

package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.commands.CommandBase;

public class DriveStraight extends CommandBase {
	
	private int countAuto;
	private int maxTime;
	
	protected void initialize() {
		countAuto = 0;
		maxTime = 150;
	}
	
	protected void execute() {
		if (countAuto++ <= maxTime) {
			chassis.drive(-0.7, -chassis.getGyroAngle());
		} else {
			chassis.drive(0.0, 0.0);
		}

		if (countAuto > 10000) {
			countAuto = 0;
		}
	}

	protected void interrupted() {
	}

	protected void end() {
	}

	protected boolean isFinished() {
		if(countAuto >= maxTime) {
			return true;
		}
		
		return false;
	}

}

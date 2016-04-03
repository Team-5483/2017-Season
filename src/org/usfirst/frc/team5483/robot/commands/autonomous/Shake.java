package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.commands.CommandBase;

public class Shake extends CommandBase {
	
	private boolean isDone;
	private int autoCount;
	
	protected void initialize() {
		isDone = false;
		autoCount = 0;
	}

	protected void execute() {
		if(autoCount++ < 25) {
			chassis.drive(0.0, 0.9);
		} else if(autoCount > 25 && autoCount < 75) {
			chassis.drive(0.0, -0.9);
		}
		
	}

	protected void interrupted() {
	}

	protected void end() {
	}

	protected boolean isFinished() {
		if(isDone) {
			return true;
		}
		
		return false;
	}
}

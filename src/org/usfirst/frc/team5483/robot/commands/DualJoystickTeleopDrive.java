package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.DualJoysticks;
import org.usfirst.frc.team5483.robot.io.XboxRemote;

public class DualJoystickTeleopDrive extends CommandBase {
	
	private DualJoysticks dualJoysticks;

	protected void initialize() {
		dualJoysticks = new DualJoysticks();
	}

	protected void execute() {
		double y = dualJoysticks.getJoystick1Y() * speedModifierY;
		double x = dualJoysticks.getJoystick2X() * speedModifierX;
		double mid = 0;
		mid = dualJoysticks.getJoystick1X()/2 + dualJoysticks.getJoystick2X()/2;
		
		chassis.middleWheel(mid);
		chassis.drive(y, x);
	}

	protected void interrupted() {
	}

	protected void end() {
	}

	protected boolean isFinished() {
		return false;
	}
}

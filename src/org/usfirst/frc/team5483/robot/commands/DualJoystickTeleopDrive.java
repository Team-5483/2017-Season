package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.DualJoysticks;
import org.usfirst.frc.team5483.robot.io.XboxRemote;

public class DualJoystickTeleopDrive extends CommandBase {
	private DualJoysticks dualJoysticks;

	// Real Front Speed Modifiers
	private double speedModifierY = 1.0;
	private double speedModifierX = 0.5;

	protected void initialize() {
		dualJoysticks = new DualJoysticks();
	}

	protected void execute() {
		double y = dualJoysticks.getJoystick1Y() * speedModifierY;
		double x = dualJoysticks.getJoystick2X() * speedModifierX;
		
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

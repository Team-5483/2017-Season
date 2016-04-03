package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.XboxRemote;

public class XboxTeleopDrive extends CommandBase {

	private XboxRemote xboxRemote;

	// Real Front Speed Modifiers
	private double speedModifierY = 1.0;
	private double speedModifierX = 0.5;

	protected void initialize() {
		xboxRemote = new XboxRemote();
	}

	protected void execute() {
		double y = xboxRemote.getLeftJoystickY() * speedModifierY;
		double x = xboxRemote.getRightJoystickX() * speedModifierX;
		
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

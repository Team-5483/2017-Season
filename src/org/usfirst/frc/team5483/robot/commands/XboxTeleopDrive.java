package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.XboxRemote;

public class XboxTeleopDrive extends CommandBase {

	private XboxRemote xboxRemote;

	protected void initialize() {
		xboxRemote = new XboxRemote();
	}

	protected void execute() {
		double y = xboxRemote.getLeftJoystickY() * speedModifierY;
		double x = xboxRemote.getRightJoystickX() * speedModifierX;
		double mid = 0;
		if(xboxRemote.isLeftTriggerPressed()) mid = -1;
		if(xboxRemote.isRightTriggerPressed()) mid = 1;
		
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

package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.XboxRemote;

public class ExperimentalDrive extends CommandBase {

	private XboxRemote xboxRemote;

	private boolean gridDrive = false;

	protected void initialize() {
		xboxRemote = new XboxRemote();
	}

	protected void execute() {
		chassis.angle+=chassis.getGyroAngle();
		double y = xboxRemote.getRightJoystickY() * speedModifierY;
		double x = xboxRemote.getRightJoystickX() * speedModifierX;
		double z = xboxRemote.getLeftJoystickX();
		double mid = 0;
		if (!gridDrive) {
			if (xboxRemote.isLeftTriggerPressed())
				mid = -1;
			if (xboxRemote.isRightTriggerPressed())
				mid = 1;

			chassis.middleWheel(mid);
			chassis.drive(z,y);
		} else {
			chassis.drive((y-z)*Math.cos(chassis.angle), (y+z)*Math.cos(chassis.angle));
			chassis.middleWheel(x*Math.sin(chassis.angle));
			
		}
	}

	protected boolean isFinished() {
		return false;
	}

}

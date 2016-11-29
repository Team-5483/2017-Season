package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.SingleJoystick;

public class SingleJoystickTeleopDrive extends CommandBase{

	
	private SingleJoystick joystick;

	// Real Front Speed Modifiers
	private double speedModifierY = 1.0;
	private double speedModifierX = 0.5;

	protected void initialize() {
		joystick = new SingleJoystick();
	}

	protected void end() {
		
	}

	protected void execute() {
		double y = joystick.getJoystickY() * speedModifierY;
		double x = joystick.getJoystickX() * speedModifierX;
		
		chassis.drive(y, x);
	}

	protected void interrupted() {
		
	}

	protected boolean isFinished() {
		return false;
	}

}

package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.SingleJoystick;

public class SingleJoystickTeleopDrive extends CommandBase{

	private SingleJoystick joystick;

	protected void initialize() {
		joystick = new SingleJoystick();
	}

	protected void end() {
		
	}

	protected void execute() {
		double y = joystick.getJoystickY() * speedModifierY * joystick.getJoystickSlider();
		double x = joystick.getJoystickX() * speedModifierX;
		double mid = 0;
		if(joystick.getJoystickKnobOnTopX() == -1) mid=-1;
		if(joystick.getJoystickKnobOnTopX() == 1) mid=1;

		
		chassis.middleWheel(mid);
		chassis.drive(y, x);
		
		if(joystick.getTrigger()) {testSubsystem.shoot();}
	}

	protected void interrupted() {
		
	}

	protected boolean isFinished() {
		return false;
	}

}

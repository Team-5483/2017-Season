package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.io.SingleJoystick;
import org.usfirst.frc.team5483.robot.subsystems.PneumaticTest;

public class SingleJoystickTeleopDrive extends CommandBase{

	private PneumaticTest pneumaticTest;
	private SingleJoystick joystick;

	// Real Front Speed Modifiers
	private double speedModifierY = 1.0;
	private double speedModifierX = 0.5;

	protected void initialize() {
		joystick = new SingleJoystick();
		pneumaticTest = new PneumaticTest();
	}

	protected void end() {
		
	}

	protected void execute() {
		pneumaticTest.startCompressor();
		double y = joystick.getJoystickY() * speedModifierY * joystick.getJoystickSlider();
		double x = joystick.getJoystickX() * speedModifierX;
		if(joystick.getTrigger()) pneumaticTest.setSolenoid(true);
		else pneumaticTest.setSolenoid(false);
		chassis.drive(y, x);
	}

	protected void interrupted() {
		
	}

	protected boolean isFinished() {
		return false;
	}

}

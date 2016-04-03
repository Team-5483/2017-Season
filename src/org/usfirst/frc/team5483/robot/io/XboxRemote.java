package org.usfirst.frc.team5483.robot.io;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

public class XboxRemote {
	private static final byte XBOX_REMOTE = 0;

	private static final byte XBOX_DPAD = 0;
	private static final byte XBOX_LEFT_ANALOG_STICK_X_AXIS = 0;
	private static final byte XBOX_LEFT_ANALOG_STICK_Y_AXIS = 1;
	private static final byte XBOX_LEFT_TRIGGER = 2;
	private static final byte XBOX_RIGHT_TRIGGER = 3;
	private static final byte XBOX_RIGHT_ANALOG_STICK_X_AXIS = 4;
	private static final byte XBOX_RIGHT_ANALOG_STICK_Y_AXIS = 5;

	private static final byte XBOX_A = 1;
	private static final byte XBOX_B = 2;
	private static final byte XBOX_X = 3;
	private static final byte XBOX_Y = 4;
	private static final byte XBOX_START = 8;
	private static final byte XBOX_SELECT = 7;
	private static final byte XBOX_LB = 5;
	private static final byte XBOX_RB = 6;
	private static final byte XBOX_LT = 9;
	private static final byte XBOX_RT = 10;
	
	private static final Joystick xboxRemote = new Joystick(XBOX_REMOTE);
	
	private static final Button aButton = new JoystickButton(xboxRemote, XBOX_A);
	private static final Button bButton = new JoystickButton(xboxRemote, XBOX_B);
	private static final Button xButton = new JoystickButton(xboxRemote, XBOX_X);
	private static final Button yButton = new JoystickButton(xboxRemote, XBOX_Y);
	private static final Button startButton = new JoystickButton(xboxRemote, XBOX_START);
	private static final Button selectButton = new JoystickButton(xboxRemote, XBOX_SELECT);
	private static final Button LBButton = new JoystickButton(xboxRemote, XBOX_LB);
	private static final Button RBButton = new JoystickButton(xboxRemote, XBOX_RB);
	
	private static double DEADZONE_MAGIC_NUMBER = .15;

	// XBOX CONTROLLER
	public void whileAButtonHeld(Command command) {
		aButton.whileHeld(command);
	}

	public void whileBButtonHeld(Command command) {
		bButton.whileHeld(command);
	}

	public void whileXButtonHeld(Command command) {
		xButton.whileHeld(command);
	}

	public void whileYButtonHeld(Command command) {
		yButton.whileHeld(command);
	}

	public void whileAButtonPressed(Command command) {
		aButton.whenPressed(command);
	}

	public void whileBButtonPressed(Command command) {
		bButton.whenPressed(command);
	}

	public void whileXButtonPressed(Command command) {
		xButton.whenPressed(command);
	}

	public void whileYButtonPressed(Command command) {
		yButton.whenPressed(command);
	}

	public void whileAButtonReleased(Command command) {
		aButton.whenReleased(command);
	}

	public void whileBButtonReleased(Command command) {
		bButton.whenReleased(command);
	}

	public void whileXButtonReleased(Command command) {
		xButton.whenReleased(command);
	}

	public void whileYButtonReleased(Command command) {
		yButton.whenReleased(command);
	}

	public double getLeftJoystickX() {
		return deadzone(xboxRemote.getRawAxis(XBOX_LEFT_ANALOG_STICK_X_AXIS));
	}

	public double getLeftJoystickY() {
		return deadzone(xboxRemote.getRawAxis(XBOX_LEFT_ANALOG_STICK_Y_AXIS));
	}

	public double getRightJoystickX() {
		return deadzone(xboxRemote.getRawAxis(XBOX_RIGHT_ANALOG_STICK_X_AXIS));
	}

	public double getRightJoystickY() {
		return deadzone(xboxRemote.getRawAxis(XBOX_RIGHT_ANALOG_STICK_Y_AXIS));
	}
	
	private static double deadzone(double d) {
		if (Math.abs(d) < DEADZONE_MAGIC_NUMBER) {
			return 0;
		}

		return (d / Math.abs(d)) * ((Math.abs(d) - DEADZONE_MAGIC_NUMBER) / (1 - DEADZONE_MAGIC_NUMBER));
	}
}

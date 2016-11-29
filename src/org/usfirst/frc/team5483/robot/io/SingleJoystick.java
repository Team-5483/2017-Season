package org.usfirst.frc.team5483.robot.io;

import edu.wpi.first.wpilibj.Joystick;

public class SingleJoystick {
	private static final byte JOYSTICK = 0;
	
	private static final byte JOYSTICK_ANALOG_STICK_X_AXIS = 0;
	private static final byte JOYSTICK_ANALOG_STICK_Y_AXIS = 1;
 	
 	private static final Joystick joystick = new Joystick(JOYSTICK);
	
 	public double getJoystickX() {
 		return joystick.getRawAxis(JOYSTICK_ANALOG_STICK_X_AXIS);
 	}
 	
	public double getJoystickY() {
 		return joystick.getRawAxis(JOYSTICK_ANALOG_STICK_X_AXIS);
 	}
}

package org.usfirst.frc.team5483.robot.io;

import edu.wpi.first.wpilibj.Joystick;

public class DualJoysticks {
	private static final byte JOYSTICK1 = 0;
	private static final byte JOYSTICK2 = 1;
 	
	private static final byte JOYSTICK_ANALOG_STICK_X_AXIS = 0;
	private static final byte JOYSTICK_ANALOG_STICK_Y_AXIS = 1;
 	
 	private static final Joystick joystick1 = new Joystick(JOYSTICK1);
	private static final Joystick joystick2 = new Joystick(JOYSTICK2);
	
	public double getJoystick1X() {
		return joystick1.getRawAxis(JOYSTICK_ANALOG_STICK_X_AXIS);
	}
	
	public double getJoystick1Y() {
		return joystick1.getRawAxis(JOYSTICK_ANALOG_STICK_Y_AXIS);
	}
	
	public double getJoystick2X() {
		return joystick2.getRawAxis(JOYSTICK_ANALOG_STICK_X_AXIS);
	}
	
	public double getJoystick2Y() {
		return joystick2.getRawAxis(JOYSTICK_ANALOG_STICK_Y_AXIS);
	}
}

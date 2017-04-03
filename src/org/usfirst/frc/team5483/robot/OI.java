package org.usfirst.frc.team5483.robot;

import org.usfirst.frc.team5483.robot.commands.ClimbRope;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private static Joystick leftStick = new Joystick(RobotMap.lStickPort);
	private static Joystick rightStick = new Joystick(RobotMap.rStickPort);
	
	public OI() {
		JoystickButton r_trigger = new JoystickButton(rightStick,  RobotMap.joystick_trigger);
		
		JoystickButton r_butt_3 = new JoystickButton( rightStick,  RobotMap.joystick_3);
		JoystickButton r_butt_4 = new JoystickButton( rightStick,  RobotMap.joystick_4);
		JoystickButton r_butt_5 = new JoystickButton( rightStick,  RobotMap.joystick_5);
		
		r_butt_4.whileHeld(new ClimbRope(0.2f));
		r_butt_3.whileHeld(new ClimbRope(0.5f));
		r_butt_5.whileHeld(new ClimbRope(0.8f));

		r_trigger.whileHeld(new ClimbRope(1.0f));
	}
	
	public Joystick getLeftStick() {
		return leftStick;
	}
	
	public Joystick getRightStick() {
		return rightStick;
	}
}

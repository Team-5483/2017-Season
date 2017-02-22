package org.usfirst.frc.team5483.robot;

import org.usfirst.frc.team5483.robot.commands.ClimbRope;
import org.usfirst.frc.team5483.robot.commands.GrabBalls;
import org.usfirst.frc.team5483.robot.commands.LaunchBall;
import org.usfirst.frc.team5483.robot.commands.LoadBall;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private static Joystick leftStick = new Joystick(RobotMap.lStickPort);
	private static Joystick rightStick = new Joystick(RobotMap.rStickPort);
	
	public OI() {
		
		//Buttons - port #s are subject to change when tested
//		JoystickButton r_trigger = new JoystickButton(rightStick, RobotMap.logitech_trigger);
//		JoystickButton r_butt_4 = new JoystickButton( rightStick, RobotMap.logitech_4);
//		
		JoystickButton r_trigger = new JoystickButton(rightStick,  RobotMap.logitech_trigger);
		JoystickButton r_butt_2 = new JoystickButton( rightStick,  RobotMap.logitech_2);
		JoystickButton r_butt_3 = new JoystickButton( rightStick,  RobotMap.logitech_3);
		JoystickButton r_butt_4 = new JoystickButton( rightStick,  RobotMap.logitech_4);
		JoystickButton r_butt_5 = new JoystickButton( rightStick,  RobotMap.logitech_5);
		JoystickButton r_butt_6 = new JoystickButton( rightStick,  RobotMap.logitech_6);
		JoystickButton r_butt_7 = new JoystickButton( rightStick,  RobotMap.logitech_7);
		
		r_butt_5.whileHeld(new ClimbRope());
		
		r_butt_6.whileHeld(new GrabBalls());
		
		r_trigger.whileHeld(new LoadBall());
		r_butt_2.whileHeld(new LaunchBall());
	}
	
	public Joystick getLeftStick() {
		return leftStick;
	}
	
	public Joystick getRightStick() {
		return rightStick;
	}
}

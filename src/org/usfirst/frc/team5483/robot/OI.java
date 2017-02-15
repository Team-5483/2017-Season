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
		JoystickButton r_trigger = new JoystickButton(rightStick, RobotMap.logitech_trigger);
		JoystickButton r_butt_4 = new JoystickButton( rightStick, RobotMap.logitech_4);
		
		JoystickButton l_trigger = new JoystickButton(leftStick,  RobotMap.logitech_trigger);
		JoystickButton l_butt_2 = new JoystickButton( leftStick,  RobotMap.logitech_2);
		JoystickButton l_butt_3 = new JoystickButton( leftStick,  RobotMap.logitech_3);
		JoystickButton l_butt_4 = new JoystickButton( leftStick,  RobotMap.logitech_4);
		JoystickButton l_butt_5 = new JoystickButton( leftStick,  RobotMap.logitech_5);
		
		l_butt_2.whileHeld(new ClimbRope());
		
		l_butt_3.whileHeld(new GrabBalls());
		
		l_butt_4.whenPressed(new LoadBall());
		l_butt_4.whenReleased(new LaunchBall());
	}
	
	public Joystick getLeftStick() {
		return leftStick;
	}
	
	public Joystick getRightStick() {
		return rightStick;
	}
}

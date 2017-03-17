package org.usfirst.frc.team5483.robot;

import org.usfirst.frc.team5483.robot.commands.ClimbRope;
import org.usfirst.frc.team5483.robot.commands.SweepBalls;
import org.usfirst.frc.team5483.robot.commands.LaunchBall;
import org.usfirst.frc.team5483.robot.commands.LoadBall;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	private static Joystick leftStick = new Joystick(RobotMap.lStickPort);
	private static Joystick rightStick = new Joystick(RobotMap.rStickPort);
	
	public OI() {
		JoystickButton l_trigger = new JoystickButton(leftStick,   RobotMap.joystick_trigger);
		JoystickButton l_butt_2 = new JoystickButton( leftStick,   RobotMap.joystick_2);
		JoystickButton l_butt_3 = new JoystickButton( leftStick,   RobotMap.joystick_3);
		JoystickButton l_butt_4 = new JoystickButton( leftStick,   RobotMap.joystick_4);
		JoystickButton l_butt_5 = new JoystickButton( leftStick,   RobotMap.joystick_5);
		JoystickButton l_butt_6 = new JoystickButton( leftStick,   RobotMap.joystick_6);
		JoystickButton l_butt_7 = new JoystickButton( leftStick,   RobotMap.joystick_7);
		
		JoystickButton r_trigger = new JoystickButton(rightStick,  RobotMap.joystick_trigger);
		JoystickButton r_butt_2 = new JoystickButton( rightStick,  RobotMap.joystick_2);
		JoystickButton r_butt_3 = new JoystickButton( rightStick,  RobotMap.joystick_3);
		JoystickButton r_butt_4 = new JoystickButton( rightStick,  RobotMap.joystick_4);
		JoystickButton r_butt_5 = new JoystickButton( rightStick,  RobotMap.joystick_5);
		JoystickButton r_butt_6 = new JoystickButton( rightStick,  RobotMap.joystick_6);
		JoystickButton r_butt_7 = new JoystickButton( rightStick,  RobotMap.joystick_7);
		
		r_butt_2.whileHeld(new ClimbRope());
		
		r_butt_5.whileHeld(new SweepBalls());
		
		r_butt_3.whileHeld(new LoadBall());
		r_trigger.whileHeld(new LaunchBall());
	}
	
	public Joystick getLeftStick() {
		return leftStick;
	}
	
	public Joystick getRightStick() {
		return rightStick;
	}
}

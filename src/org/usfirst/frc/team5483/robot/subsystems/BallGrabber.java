package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BallGrabber extends Subsystem {

	private Talon grabberMotor;
	
	public BallGrabber() {
		grabberMotor = new Talon(RobotMap.ballGrabberMotor);
	}
	
	public void spinGrabber() {
		grabberMotor.set(1);
	}
	
	public void stopGrabber() {
		grabberMotor.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
	
}

package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class BallGrabber extends Subsystem {

	private Talon grabberMotor;
	private boolean spinning = false;
	
	public BallGrabber() {
		grabberMotor = new Talon(RobotMap.ballGrabberMotor);
	}
	
	public void spinGrabber() {
		grabberMotor.set(1);
		spinning = true;
	}
	
	public void stopGrabber() {
		grabberMotor.set(0);
		spinning = false;
	}
	
	public void log() {
		SmartDashboard.putBoolean("Grabbing Balls", spinning);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
	
}

package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class BallShooter extends Subsystem {
	
	private Victor loadBallMotor;
	private Victor launchBallMotor;
	
	private boolean ballReady = false;
	
	public BallShooter() {
		loadBallMotor = new Victor(RobotMap.ballLoaderMotor);
		launchBallMotor = new Victor(RobotMap.ballLauncherMotor);
	}
	
	public void loadBall() {
		loadBallMotor.setSpeed(0.5);
	}
	
	public void launchBall() {
		launchBallMotor.setSpeed(1.0);
	}
	
	public void stopLoadMotor() {
		loadBallMotor.setSpeed(0);
	}
	
	public void stopLaunchMotor() {
		launchBallMotor.setSpeed(0);
	}
	
	public void log() {
		SmartDashboard.putBoolean("Ball Loaded", ballReady);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
	
}

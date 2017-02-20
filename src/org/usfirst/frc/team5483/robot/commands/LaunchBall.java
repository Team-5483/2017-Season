package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LaunchBall extends Command {
	
	public LaunchBall() {
		requires(Robot.ballShooter);
	}

	@Override
	protected void initialize() {
	}
    
	@Override
	protected void execute() {
		Robot.ballShooter.launchBall();
	}

	protected boolean isFinished() {
		return false;
	}
    
	@Override
	protected void end() {
		Robot.ballShooter.stopLaunchMotor();
	}
    
	@Override
	protected void interrupted() {
		Robot.ballShooter.stopLaunchMotor();
	}
}
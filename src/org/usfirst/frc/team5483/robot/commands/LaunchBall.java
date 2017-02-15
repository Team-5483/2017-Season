package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LaunchBall extends Command {
	
	private Timer timer;
	
	public LaunchBall() {
		requires(Robot.ballShooter);

		timer = new Timer();
	}

	@Override
	protected void initialize() {
		timer.start();
	}
    
	@Override
	protected void execute() {
		Robot.ballShooter.launchBall();
	}

	protected boolean isFinished() {
		if(timer.hasPeriodPassed(2)) {
			timer.stop();
			timer.reset();
			return true;
		}
    	
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
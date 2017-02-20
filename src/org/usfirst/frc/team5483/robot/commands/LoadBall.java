package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LoadBall extends Command {
	
	private Timer timer;
	
	public LoadBall() {
		timer = new Timer();
	}

	protected void initialize() {
		timer.start();
	}

	protected void execute() {
		Robot.ballShooter.loadBall();
	}

	protected boolean isFinished() {
		if(timer.hasPeriodPassed(0.5)) {
			timer.stop();
			timer.reset();
			return true;
		}
    	
		return false;
	}

	protected void end() {
		Robot.ballShooter.stopLoadMotor();
	}

	protected void interrupted() {
		Robot.ballShooter.stopLoadMotor();
	}
}
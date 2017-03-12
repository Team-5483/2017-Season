package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SweepBalls extends Command {
	
	public SweepBalls() {
		requires(Robot.ballBrush);
	}
	
	@Override
	public void execute() {
		Robot.ballBrush.spinGrabber();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.ballBrush.stopGrabber();
	}

	@Override
	protected void interrupted() {
    	Robot.ballBrush.stopGrabber();
	}
}

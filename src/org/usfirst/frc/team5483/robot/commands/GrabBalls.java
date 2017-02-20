package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class GrabBalls extends Command {
	
	public GrabBalls() {
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

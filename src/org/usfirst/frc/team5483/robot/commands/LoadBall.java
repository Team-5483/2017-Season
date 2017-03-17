package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class LoadBall extends Command {
	
	public LoadBall() {
		//doesn't require anything because it interferes with the
		//the shooting but should technically require ballshooter lol
	}

	protected void initialize() {
	}

	protected void execute() {
		Robot.ballShooter.loadBall();
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		Robot.ballShooter.stopLoadMotor();
	}

	protected void interrupted() {
		Robot.ballShooter.stopLoadMotor();
	}
}
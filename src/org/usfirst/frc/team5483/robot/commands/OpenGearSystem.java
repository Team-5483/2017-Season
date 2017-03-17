package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class OpenGearSystem extends Command {
	
	public OpenGearSystem() {
		requires(Robot.gearSystem);
	}
	
	@Override
	public void execute() {
		Robot.gearSystem.open();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
}

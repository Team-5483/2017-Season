package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class CloseGearSystem extends Command {
	
	public CloseGearSystem() {
		requires(Robot.gearSystem);
	}
	
	@Override
	public void execute() {
		Robot.gearSystem.close();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}

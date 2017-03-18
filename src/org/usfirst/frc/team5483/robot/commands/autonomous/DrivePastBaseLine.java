package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.commands.DriveXDistance;

import edu.wpi.first.wpilibj.command.Command;

public class DrivePastBaseLine extends Command {
	private DriveXDistance drive;
	
	public DrivePastBaseLine() {
		drive = new DriveXDistance(100);
	}
	
	public void execute() {
		drive.execute();
	}
	
	protected boolean isFinished() {
		return false;
	}

}
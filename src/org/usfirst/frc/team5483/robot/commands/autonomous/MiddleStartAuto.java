package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.commands.DriveXDistance;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MiddleStartAuto extends CommandGroup {
	public MiddleStartAuto() {
		addSequential(new DriveXDistance(100));
	}
}

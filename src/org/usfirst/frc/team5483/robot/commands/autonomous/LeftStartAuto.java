package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.commands.AllignPeg;
import org.usfirst.frc.team5483.robot.commands.DriveXDistance;
import org.usfirst.frc.team5483.robot.constants.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LeftStartAuto extends CommandGroup {
	//instead of angles of 1/360 there will be this
	double angleRatio = (Constants.WIDTH_WHEEL_TO_WHEEL * Math.PI)/360;
	
	public LeftStartAuto() {
		addSequential(new DriveXDistance(Constants.DISTANCE_TO_BASE_LINE));
		DriveXDistance turn = new DriveXDistance(40*angleRatio);
		turn.setLeftMul(0);
		addSequential(turn);
		addParallel(new AllignPeg());
		
	}
}

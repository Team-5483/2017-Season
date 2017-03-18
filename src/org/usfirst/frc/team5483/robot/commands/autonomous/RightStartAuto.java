package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.commands.AllignPeg;
import org.usfirst.frc.team5483.robot.commands.DriveXDistance;
import org.usfirst.frc.team5483.robot.constants.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class RightStartAuto extends CommandGroup {
	// instead of angles of 1/360 there will be this
	double angleRatio = (Constants.WIDTH_WHEEL_TO_WHEEL * Math.PI) / 360;

	public RightStartAuto() {
		addSequential(new DriveXDistance(Constants.DISTANCE_TO_BASE_LINE));
		addParallel(new AllignPeg());
		DriveXDistance turn = new DriveXDistance(40 / angleRatio);
		turn.setRightMul(0);
		addSequential(turn);
	}
}

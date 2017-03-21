package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.Robot;
import org.usfirst.frc.team5483.robot.commands.DriveXDistance;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class DrivePastBaseLine extends Command {
	private DriveXDistance drive;
	
	Timer timer;
	
	public DrivePastBaseLine() {
		//drive = new DriveXDistance(100);
		timer = new Timer();
		timer.start();
	}
	
	public void execute() {
		//drive.execute();
		
		Robot.chassis.drive(0.6, 0.6);
		
	
	}
	
	protected boolean isFinished() {
		
		if(timer.get() < 5) {
			return false;
		}
		
		return true;
	}
	
	public void end() {
		Robot.chassis.drive(0.0, 0.0);
	}
	
	

}
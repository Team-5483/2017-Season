package org.usfirst.frc.team5483.robot.commands.autonomous;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TestEncoders extends Command {
	
	boolean running = true;
	
	@Override
	public void execute() {
		if(Robot.chassis.getLeftEncoder().getDistance() < 20000 &&
				Robot.chassis.getRightEncoder().getDistance() < 20000) {
			
			Robot.chassis.drive(0.5, 0);
			
		}
		
		running = false;
	}
	
	@Override
	protected boolean isFinished() {
		return running;
	}

}

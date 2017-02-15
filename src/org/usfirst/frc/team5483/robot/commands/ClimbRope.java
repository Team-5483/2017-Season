package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Talon;

public class ClimbRope extends Command {
	
	public ClimbRope() {
		requires(Robot.climber);
	}
	
	@Override
	public void execute() {
		Robot.climber.climbRope();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
    protected void end() {
		Robot.climber.climbStop();
    }
    
    @Override
    protected void interrupted() {
    	Robot.climber.climbStop();
    }

}

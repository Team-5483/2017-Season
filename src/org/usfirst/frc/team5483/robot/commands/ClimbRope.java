package org.usfirst.frc.team5483.robot.commands;

import org.usfirst.frc.team5483.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Talon;

public class ClimbRope extends Command {
	private float speed;
	
	public ClimbRope(float speed) {
		requires(Robot.climber);
		this.speed = speed;
	}

	@Override
	public void execute() {
		Robot.climber.climbRope(speed);
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

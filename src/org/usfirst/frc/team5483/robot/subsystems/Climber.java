package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	
	private static Spark winchMotor;
	
	//-1 pulls rope down, 1 pulls up
	int direction = -1;
	
	public Climber() {
		winchMotor = new Spark(RobotMap.climber);
	}
	
	public void climbRope() {
		winchMotor.set(direction);
	}
	
	public void undoRope() {
		winchMotor.set(-direction);
	}
	
	public void climbStop() {
		winchMotor.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
}

package org.usfirst.frc.team5483.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	
	private static final Talon winchMotor = new Talon(9);
	
	public void climbRope() {
		winchMotor.set(1);
	}
	
	public void climbStop() {
		winchMotor.set(0);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
}

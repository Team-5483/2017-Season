package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearSystem extends Subsystem {
	
	private Solenoid solenoid;
	
	private boolean open = false;
	
	public GearSystem() {
		solenoid = new Solenoid(RobotMap.gearSolenoid);
	}
	
	public void open() {
		open = true;
		solenoid.set(true);
	}
	
	public void close() {
		open = false;
		solenoid.set(false);
	}
	
	public boolean isOpen() {
		return open;
	}
	
	@Override
	protected void initDefaultCommand() {
	}

}

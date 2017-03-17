package org.usfirst.frc.team5483.robot.subsystems;

import org.usfirst.frc.team5483.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearSystem extends Subsystem {
	
	private DoubleSolenoid solenoid;
	
	private boolean open = false;
	
	public GearSystem() {
		solenoid = new DoubleSolenoid(RobotMap.gearSolenoidOpen, RobotMap.gearSolenoidClose);
	}
	
	public void open() {
		open = true;
		solenoid.set(DoubleSolenoid.Value.kForward);
	}
	
	public void close() {
		open = false;
		solenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public boolean isOpen() {
		return open;
	}
	
	@Override
	protected void initDefaultCommand() {
	}

}

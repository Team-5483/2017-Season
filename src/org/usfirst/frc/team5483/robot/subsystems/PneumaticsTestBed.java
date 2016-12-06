package org.usfirst.frc.team5483.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PneumaticsTestBed extends Subsystem {
	
	public Compressor compressor;
	public Solenoid solenoidIn; 
	public Solenoid solenoidOut; 
	
	public PneumaticsTestBed() {
		compressor = new Compressor();
		solenoidIn = new Solenoid(0);
		solenoidOut = new Solenoid(1);
	}

	protected void initDefaultCommand() {
		
	}
	
	public void shoot() {
		solenoidOut.set(true);
	}

}

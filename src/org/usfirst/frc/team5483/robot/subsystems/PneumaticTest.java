package org.usfirst.frc.team5483.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

public class PneumaticTest {
	Compressor compressor = new Compressor(0);
	
	Solenoid solenoid = new Solenoid(0,1);
	
	public PneumaticTest() {
		compressor.setClosedLoopControl(true);
	}
	
	public void startCompressor() {
		compressor.start();
	}
	
	public void stopCompressor() {
		compressor.stop();
	}
	
	public void setSolenoid(boolean a) {
		solenoid.set(a);
	}
	
	public boolean isCompressorEnabled() {
		return compressor.enabled();
	}
	
	public boolean getPressureSwitchValue() {
		return  compressor.getPressureSwitchValue();
	}
	
	public float getCompressorCurrent() {
		return compressor.getCompressorCurrent();
	}
}

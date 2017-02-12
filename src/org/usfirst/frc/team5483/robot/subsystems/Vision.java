package org.usfirst.frc.team5483.robot.subsystems;

import org.opencv.videoio.VideoCapture;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Vision extends Subsystem {
	
	VideoCapture camera;
	
	public Vision() {
		camera = new VideoCapture();
		startCamera();
	}
	
	private void startCamera(){
		camera.open(0);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
	
	

}

package org.usfirst.frc.team5483.robot.subsystems;


import org.opencv.videoio.VideoCapture;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Camera extends Subsystem{
	VideoCapture camera;
	
	private void startCamera(){
		camera.open(0);
	}
	
	protected void initDefaultCommand() {
		camera = new VideoCapture();
		startCamera();
	}


}

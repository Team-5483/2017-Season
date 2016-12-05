package org.usfirst.frc.team5483.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;

public class EncoderTest {
	private Encoder enc1, enc2, enc3, enc4;
	
	public EncoderTest() {
		enc1 = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
		enc2 = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
		enc3 = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
		enc4 = new Encoder(0, 1, false, Encoder.EncodingType.k4X);
	}

	public Encoder getEncoder1() {
		return enc1;
	}

	public Encoder getEncoder2() {
		return enc2;
	}

	public Encoder getEncoder3() {
		return enc3;
	}

	public Encoder getEncoder4() {
		return enc4;
	}
	
}

package org.usfirst.frc.team6947.robot.subsystems;

import org.usfirst.frc.team6947.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Shooter extends Subsystem {

    private Victor shooter;
    public Solenoid Pincher;
    DifferentialDrive shooterMotor, liftMotor;

    public Shooter() {
    	shooter = new Victor(RobotMap.SHOOTER);
    	
    	Pincher = new Solenoid(5, RobotMap.PINCHER);
    	
    

    }
    public void initDefaultCommand() {
    }
    
    public void collect (double power) {
    	shooter.set(power);
    	
    }
    public void eject(double power) {
    	shooter.set(-power);
    	
    }
    public void pinch() {
    	Pincher.set(false);
    }
    public void release() {
    	Pincher.set(true);
    }
    public void stop() {
    	shooter.set(0);
    }
	public void pincherSafety() {
		if(Pincher.get() == true) {
	    	Pincher.set(false);
		}else if(Pincher.get()  == false) {
	    	Pincher.set(true);
		}
			
	}
}


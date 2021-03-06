package org.usfirst.frc.team6947.robot.commands;

import org.usfirst.frc.team6947.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class CollectBlock extends Command {
	private double power;
    public CollectBlock(double power) {
    	requires(Robot.shooter);
    	this.power = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
		SmartDashboard.putString("Running Commend : ", "CollectBlock");
//-----------------------------------------------------------------------
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.collect(power);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println(Robot.chassis.getEncoderTick());
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}

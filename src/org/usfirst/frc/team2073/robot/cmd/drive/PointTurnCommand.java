package org.usfirst.frc.team2073.robot.cmd.drive;

import org.usfirst.frc.team2073.robot.OI;
import org.usfirst.frc.team2073.robot.RobotMap;
import org.usfirst.frc.team2073.robot.subsys.DrivetrainSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class PointTurnCommand extends Command {
	private final DrivetrainSubsystem drivetrain;

	public PointTurnCommand() {
		drivetrain = RobotMap.getDrivetrain();
		requires(drivetrain);
	}

	@Override
	protected void execute() {
		drivetrain.pointTurn(OI.getWheel().getX());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
}

package frc.robot.commands;

import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

class MoveCommand extends CommandBase {
    public static DriveBase drive = RobotContainer.drive;
    private double x, y, z;

    public SimpleDrive(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        addRequirements(drive);
    }

    @Override
    private void execute() {
        drive.setSpeeds(x, y, z);
    }

    @Override
    public void end (boolean interrupted)
    {
        drive.setSpeeds(0.0, 0.0, 0.0);
    }
}
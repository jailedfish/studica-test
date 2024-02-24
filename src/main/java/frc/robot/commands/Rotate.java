package frc.robot.commands;

import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;

class Rotate extends CommandBase {
    public static DriveBase drive = RobotContainer.drive;

    private int deg;
    private boolean inv;
 
    public Rotate(int deg) {
        inv = false;
        if (deg >= 359 || deg <= 1) {
            deg = 5;
        }

        if (deg > 180) {
            deg -= 180;
            inv = true;
        }
        this.deg = deg;
        addRequirements(drive);
    }

    @Override
    public execute() {
        if (inv) {
            drive.setSpeeds(-1, -1, -1);
        } else {
            drive.setSpeeds(1, 1, 1);
        }
    }

    @Override
    public void end() {
        drive.stop();
    }

    @Override
    public boolean isFinished() {
        if (drive.getYaw() + 2 == 0){
            return true;
        }
        return false;
    }
}
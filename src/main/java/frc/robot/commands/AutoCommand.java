package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public abstract class AutoCommand extends SequentialCommandGroup
{
    public AutoCommand ()
    {
        super();
    }

    public AutoCommand (Command ... cmd)
    {
        super(cmd);
    }
}
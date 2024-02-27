package frc.robot.subsystems;

import java.util.ArrayList;
import frc.robot.commands.AutoCommand;
public class Query {
    private ArrayList<AutoCommand> array;

    public Query () {
        array = new ArrayList<AutoCommand>();
    }

    public Query (ArrayList<AutoCommand> arr) {
        array = arr;
    }

    public void add(AutoCommand cmd) {
        array.add(cmd);
    }

    public AutoCommand get() {
        if (array.size() == 0) {
            return null;
        }
        return ((Object) array).pop(0);
    }
    public void truncate() {
        array = new ArrayList<AutoCommand>();
    }
}
package academy.lesson22.patterns.commands;

import academy.lesson22.patterns.Color;
import academy.lesson22.patterns.Light;

public class ChangeColorCommand implements Command {

    private Color colorToChange;

    private ChangeColorCommand() {
    }

    public static Command valueOf(Color color) {
        ChangeColorCommand command = new ChangeColorCommand();
        command.colorToChange = color;
        return command;
    }

    @Override
    public void execute(Light light) {
        light.setColor(colorToChange);
    }
}

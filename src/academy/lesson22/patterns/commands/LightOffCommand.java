package academy.lesson22.patterns.commands;

import academy.lesson22.patterns.Color;
import academy.lesson22.patterns.Light;

public class LightOffCommand implements Command {

    private LightOffCommand() {
    }

    public static Command valueOf() {
        return new LightOffCommand();
    }

    @Override
    public void execute(Light light) {
        light.setEnabled(false);
        light.setColor(Color.WHITE);
        light.setBrightness(5);
    }
}

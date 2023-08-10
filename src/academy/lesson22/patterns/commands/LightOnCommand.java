package academy.lesson22.patterns.commands;

import academy.lesson22.patterns.Light;

public class LightOnCommand implements Command {

    private LightOnCommand() {
    }

    public static Command valueOf() {
        return new LightOnCommand();
    }


    @Override
    public void execute(Light light) {
        light.setEnabled(true);
    }
}

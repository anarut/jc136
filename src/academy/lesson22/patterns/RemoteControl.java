package academy.lesson22.patterns;

import academy.lesson22.patterns.Light;
import academy.lesson22.patterns.commands.Command;

public class RemoteControl {

    private Light light;

    public RemoteControl(Light light) {
        this.light = light;
    }

    public void execute(Command command) {
        command.execute(light);
    }
}

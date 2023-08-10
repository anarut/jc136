package academy.lesson22.patterns;

import academy.lesson22.patterns.Color;
import academy.lesson22.patterns.Light;
import academy.lesson22.patterns.RemoteControl;
import academy.lesson22.patterns.commands.Command;
import academy.lesson22.patterns.commands.CommandFactory;
import academy.lesson22.patterns.commands.CommandType;

public class
SuperMain {

    public static void main(String[] args) {
        Light light = new Light(false);
        CommandFactory factory = CommandFactory.getInstance();
        Command lightOnCommand = factory.getCommand(CommandType.LIGHT_ON);
        Command lightOffCommand = factory.getCommand(CommandType.LIGHT_OFF);
        Command blueColorCommand = factory.getCommand(CommandType.CHANGE_COLOR, Color.BLUE);
        Command greenColorCommand = factory.getCommand(CommandType.CHANGE_COLOR, Color.GREEN);

        RemoteControl remoteControl = new RemoteControl(light);


        System.out.println(light);
        remoteControl.execute(lightOnCommand);
        System.out.println(light);
        remoteControl.execute(lightOffCommand);
        System.out.println(light);
        remoteControl.execute(greenColorCommand);
        System.out.println(light);
        remoteControl.execute(blueColorCommand);
        System.out.println(light);

    }
}

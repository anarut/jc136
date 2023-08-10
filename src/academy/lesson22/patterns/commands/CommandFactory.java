package academy.lesson22.patterns.commands;

import academy.lesson22.patterns.Color;
import academy.lesson22.Singleton;

public class CommandFactory {

    private static volatile CommandFactory instance;

    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new CommandFactory();
                }
            }
        }
        return instance;
    }

    public Command getCommand(CommandType type) {
        return getCommand(type, Color.WHITE);
    }

    public Command getCommand(CommandType type, Color color) {
        switch (type) {
            case LIGHT_OFF:
                return LightOffCommand.valueOf();
            case LIGHT_ON:
                return LightOnCommand.valueOf();
            case CHANGE_COLOR:
                return ChangeColorCommand.valueOf(color);
            case CHANGE_BRIGHTNESS:
            default:
                throw new RuntimeException();
        }
    }
}

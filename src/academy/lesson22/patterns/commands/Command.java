package academy.lesson22.patterns.commands;

import academy.lesson22.patterns.Light;

public interface Command {

    void execute(Light light);
}

package main;

import commands.*;
import diagram.DiagramCanvas;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        this.diagramCanvas.show();
    }

    public void newDiagram() {
        this.diagramCanvas = new DiagramCanvas();
    }

    public void executeAction(String commandName, String ...args) {
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }
        invoker.execute(command);

    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        if (type.equals(CommandType.DRAW_RECTANGLE)) {
            return new DrawRectangle(this.diagramCanvas);
        } else if (type.equals(CommandType.CHANGE_COLOR)) {
            return new ChangeColor(this.diagramCanvas, args[0], args[1]);
        } else if (type.equals(CommandType.CHANGE_TEXT)) {
            return new ChangeText(this.diagramCanvas, args[0], args[1]);
        } else if (type.equals(CommandType.RESIZE)) {
            return new Resize(this.diagramCanvas, args[0], args[1]);
        } else if (type.equals(CommandType.CONNECT)) {
            return new ConnectComponents(this.diagramCanvas, args[0], args[1]);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void undo(){
        invoker.undo();
    }

    public void redo() {
        invoker.redo();
    }
}

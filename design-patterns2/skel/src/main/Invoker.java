package main;

import commands.*;

import java.util.LinkedList;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {

    private LinkedList<DrawCommand> commands = new LinkedList<>();
    private LinkedList<DrawCommand> undos = new LinkedList<>();

    /**
     * Clear up all the used resources, start fresh :D    (: :) :} :[ >:(
     */
    public void restart() {
      commands.clear();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        commands.addLast(command);
        command.execute();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        if (commands.isEmpty()) {
            System.out.println("There is nothing to undo");
        } else {
            undos.addLast(commands.getLast());
            commands.getLast().undo();
            commands.remove(commands.getLast());
        }
        // TODO
        // Hint: use data structures to keep track of commands
        // Do not use the java.util.Stack, its implementation is based on vector which is inefficient and deprecated.
        // Use a class that implements the Deque interface, e.g. LinkedList https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        if (undos.isEmpty()) {
            System.out.println("There is nothing to redo");
        } else {
            undos.getLast().execute();
            commands.addLast(undos.getLast());
            undos.remove(undos.getLast());
        }
    }
}

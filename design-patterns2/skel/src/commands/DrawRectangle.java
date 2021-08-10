package commands;

import diagram.DiagramCanvas;
import main.CreateDiagram;

public class DrawRectangle implements DrawCommand {
    private CreateDiagram create = new CreateDiagram();
    private DiagramCanvas canvas;
    public DrawRectangle(final DiagramCanvas canvas) {
        this.canvas = canvas;
    }
    @Override
    public void execute() {
        create.drawRectangle(canvas);
    }

    @Override
    public void undo() {
        create.undoDraw(canvas);
    }

    @Override
    public String toString() {
        return "DrawRectangle{" +
                "canvas=" + canvas +
                '}';
    }
}

package commands;

import diagram.DiagramCanvas;
import main.CreateDiagram;

public class ChangeColor implements DrawCommand {
    private CreateDiagram create = new CreateDiagram();
    private DiagramCanvas canvas;
    private String color;
    private String index;
    private String lastColor;
    public ChangeColor(final DiagramCanvas canvas, final String index,
                       final String color) {
        this.canvas = canvas;
        this.color = color;
        this.index = index;
    }
    @Override
    public void execute() {
        lastColor = canvas.getComponent(Integer.parseInt(index)).getColor();
        create.changeColor(canvas, color, index);
    }

    @Override
    public void undo() {
        create.undoColor(canvas, lastColor, index);
    }

    @Override
    public String toString() {
        return "ChangeColor{" +
                "canvas=" + canvas +
                ", color='" + color + '\'' +
                ", index=" + index +
                '}';
    }
}

package commands;

import diagram.DiagramCanvas;
import main.CreateDiagram;

public class Resize implements DrawCommand{
    private CreateDiagram create = new CreateDiagram();
    private DiagramCanvas canvas;
    private String proc;
    private String index;
    private int lastWeight;
    private int lastHeight;

    public Resize(final DiagramCanvas canvas, final String index,
                  final String proc) {
        this.canvas = canvas;
        this.proc = proc;
        this.index = index;
    }

    @Override
    public void execute() {
        lastHeight = canvas.getComponent(Integer.parseInt(index)).getHeight();
        lastWeight = canvas.getComponent(Integer.parseInt(index)).getWeight();
        create.resize(canvas, proc, index);
    }

    @Override
    public void undo() {
        create.undoResize(canvas, lastWeight, lastHeight, index);
    }

    @Override
    public String toString() {
        return "Resize{" +
                "canvas=" + canvas +
                ", proc=" + proc +
                ", index=" + index +
                '}';
    }
}

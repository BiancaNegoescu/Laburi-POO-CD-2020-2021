package commands;

import diagram.DiagramCanvas;
import main.CreateDiagram;

public class ConnectComponents implements DrawCommand {
    private CreateDiagram create = new CreateDiagram();
    private DiagramCanvas canvas;
    private String index;
    private String indexToBeConnected;

    public ConnectComponents(final DiagramCanvas canvas, final String index,
                             final String indexToBeConnected) {
        this.canvas = canvas;
        this.index = index;
        this.indexToBeConnected = indexToBeConnected;
    }

    @Override
    public void execute() {
        create.connect(canvas, index, indexToBeConnected);
    }

    @Override
    public void undo() {
        create.undoConnect(canvas, index, indexToBeConnected);
    }

    @Override
    public String toString() {
        return "ConnectComponents{" +
                "canvas=" + canvas +
                ", index=" + index +
                ", indexToBeConnected='" + indexToBeConnected + '\'' +
                '}';
    }
}

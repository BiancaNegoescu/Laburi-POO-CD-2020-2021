package commands;

import diagram.DiagramCanvas;
import main.CreateDiagram;

public class ChangeText implements DrawCommand {
    private CreateDiagram create = new CreateDiagram();
    private DiagramCanvas canvas;
    private String text;
    private String index;
    private String lastText;

    public ChangeText(final DiagramCanvas canvas, final String index,
                      final String text) {
        this.canvas = canvas;
        this.text = text;
        this.index = index;
    }
    @Override
    public void execute() {
        lastText = canvas.getComponent(Integer.parseInt(index)).getText();
        create.changeText(canvas, text, index);
    }

    @Override
    public void undo() {
        create.undoText(canvas, lastText, index);
    }

    @Override
    public String toString() {
        return "ChangeText{" +
                "create=" + create +
                ", canvas=" + canvas +
                ", text='" + text + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}

package main;

import diagram.DiagramCanvas;
import diagram.DiagramComponent;

public class CreateDiagram {

    public void drawRectangle(final DiagramCanvas canvas) {
        canvas.addComponent(new DiagramComponent());
    }

    public void changeColor(final DiagramCanvas canvas, final String color,
                            final String index) {
        canvas.getComponent(Integer.parseInt(index)).setColor(color);
    }

    public void changeText(final DiagramCanvas canvas, final String text,
                            final String index) {
        canvas.getComponent(Integer.parseInt(index)).setText(text);
    }

    public void resize(final DiagramCanvas canvas, final String proc,
                       final String index) {
        int i = Integer.parseInt(index);
        int p = Integer.parseInt(proc);
        canvas.getComponent(i).setWeight(canvas.getComponent(i).getWeight() * p / 100);
        canvas.getComponent(i).setHeight(canvas.getComponent(i).getHeight() * p / 100);
    }

    public void connect(final DiagramCanvas canvas, final String index,
                        final String indexToBeConnected) {
        canvas.getComponent(Integer.parseInt(index)).connectTo(indexToBeConnected);
    }

    public void undoDraw(final DiagramCanvas canvas) {
        canvas.removeComponent(canvas.getComponent(canvas.getComponents().size() - 1));
    }

    public void undoColor(final DiagramCanvas canvas, final String lastColor,
                          final String index) {
        canvas.getComponent(Integer.parseInt(index)).setColor(lastColor);
    }

    public void undoText(final DiagramCanvas canvas, final String lastText,
                         final String index) {
        canvas.getComponent(Integer.parseInt(index)).setText(lastText);
    }

    public void undoResize(final DiagramCanvas canvas, final int lastWeight,
                           final int lastHeight, final String index) {
        canvas.getComponent(Integer.parseInt(index)).setWeight(lastWeight);
        canvas.getComponent(Integer.parseInt(index)).setHeight(lastHeight);
    }

    public void undoConnect(final DiagramCanvas canvas, final String index,
                            final String indexToBeConnected) {
        canvas.getComponent(Integer.parseInt(index)).removeConnection(indexToBeConnected);
    }

}

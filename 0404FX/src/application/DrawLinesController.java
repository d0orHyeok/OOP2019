package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawLinesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
    	GraphicsContext gc = canvas.getGraphicsContext2D();
    	gc.strokeLine(0,0, canvas.getWidth(), canvas.getHeight());
    	gc.strokeLine(canvas.getWidth(), 0, 0, canvas.getHeight());

    }

}
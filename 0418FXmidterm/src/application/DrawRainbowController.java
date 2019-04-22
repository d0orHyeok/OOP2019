package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class DrawRainbowController {
	@FXML 
	private Canvas canvas;
	
	private final Color[] color = {
			Color.WHITE, Color.WHITE, Color.VIOLET, Color.INDIGO, Color.BLUE,
			Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
	@FXML
	void drawRainbowButtonPressed(ActionEvent event) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		
		final int radius = 20;
		final double centerX = canvas.getWidth() / 2;
		final double maxY = canvas.getHeight() - 10;
		final double maxY2 = canvas.getHeight()/2 - 10;
		
		for (int counter = color.length*2; counter > color.length; counter--) {
			gc.setFill(color[color.length*2 - counter]);
			gc.fillArc(centerX-counter*radius,
					maxY-counter*radius, counter*radius*2, 
					counter*radius*2, 0, 180, ArcType.OPEN);
		}
		
		for (int counter = color.length; counter > 0; counter--) {
			gc.setFill(color[counter-1]);
			gc.fillArc(centerX-counter*radius,
					maxY-counter*radius, counter*radius*2, 
					counter*radius*2, 0, 180, ArcType.OPEN);
		}
	}
}

package nz.ac.auckland.se206.bluebub;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Bubble extends Region {

  private static final int PADDING = 14; // Padding for the text
  private static final int MAX_BUBBLE_WIDTH = 300; // Max width for the bubble
  private Font textFont = Font.font("Arial", 18);
  private Color textColor = Color.BLACK;
  private Color bubbleColor = Color.rgb(0, 126, 229);
  private int edgeRadius = 15;

  private Label label;

  public Bubble(String text) {
    label = new Label(text);
    label.setFont(textFont);
    label.setTextFill(textColor);
    label.setWrapText(true);
    label.setMaxWidth(MAX_BUBBLE_WIDTH);

    label.setPadding(new Insets(PADDING));
    label.setBackground(
        new Background(new BackgroundFill(bubbleColor, new CornerRadii(edgeRadius), Insets.EMPTY)));

    getChildren().add(label);
  }

  public void setBubbleColor(Color color) {
    this.bubbleColor = color;
    label.setBackground(
        new Background(new BackgroundFill(bubbleColor, new CornerRadii(edgeRadius), Insets.EMPTY)));
  }
}